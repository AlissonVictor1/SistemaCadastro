import Dominio.Pet;
import Dominio.TipoAnimal;
import Exceptions.NomeouSobrenomeInvalidoException;
import Exceptions.TipoAnimalInvalidoException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("formulario.txt");
        Pet pet = new Pet();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String linha = br.readLine();
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Sistema de cadastro de pets");
            System.out.println("----------------------------");
            System.out.println("___________MENU_____________");
            System.out.println("1.Cadastrar um novo pet");
            System.out.println("2.Alterar os dados do pet cadastrado");
            System.out.println("3.Deletar um pet cadastrado");
            System.out.println("4.Listar todos os pets cadastrados");
            System.out.println("5.Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6.Sair");
            System.out.println("----------------------------");
            System.out.println("Digite uma opção: ");
            System.out.println("----------------------------");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    input.nextLine();// limpar o buffer
                    boolean enomevalido = false;
                    while (!enomevalido) {

                        System.out.println("_____________");
                        System.out.println(linha);
                        System.out.println();

                        String nomepet = input.nextLine();
                        enomevalido = isnomeValido(nomepet);
                        if (isnomeValido(nomepet) == false) {
                            try {
                                throw new NomeouSobrenomeInvalidoException();
                            } catch (NomeouSobrenomeInvalidoException e) {
                                e.printStackTrace();
                            }
                        } else {
                            pet.setNome_e_sobrenome(linha);
                        }
                    }
                    System.out.println("_________________");
                    Boolean isTipoValido = false;
                    while(!isTipoValido) {
                        System.out.println(linha = br.readLine());
                        System.out.println("Digite 1 para Cachorro \n Digite 2 para Gato");
                        int tipoAnimal = input.nextInt();
                        if (tipoAnimal == 1) {
                            pet.setTipo(TipoAnimal.Cachorro);
                            isTipoValido = true;
                        } else if (tipoAnimal == 2) {
                            pet.setTipo(TipoAnimal.Gato);
                            isTipoValido = true;
                        } else {
                            try {
                                throw new TipoAnimalInvalidoException();
                            } catch (TipoAnimalInvalidoException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    break;
            }
        } while (opcao != 6);
    }

    public static Boolean isnomeValido(String nome) {
        String nome_e_sobrenome = nome;
        String regexnome = ("^[A-Za-z]+\\s[A-Za-z]+$"); // Padrao de Regex Que aceite duas palavras de AZ-az sem acentos ou numeros.
        Pattern pattern = Pattern.compile(regexnome);
        Matcher matcher = pattern.matcher(nome_e_sobrenome);
        Boolean verificador = matcher.find();
        return verificador;
    }

}