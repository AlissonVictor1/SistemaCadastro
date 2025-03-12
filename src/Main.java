import Exceptions.NomeouSobrenomeInvalidoException;

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
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = bufferedReader.readLine();
        System.out.println(linha);
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
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    boolean isNomeValido = false;
                       do {
                           input.nextLine(); // limpar o buffer
                           System.out.println("_____________");
                           System.out.println(linha);
                           System.out.println();

                           String nome_e_sobrenome = input.nextLine();
                           String regexnome = ("^[A-Za-z]+\\s[A-Za-z]+$\n"); // Padrao de Regex Que aceite duas palavras de AZ-az sem acentos ou numeros.
                           Pattern pattern = Pattern.compile(regexnome);
                           Matcher matcher = pattern.matcher(nome_e_sobrenome);
                           isNomeValido = matcher.find();
                       } while (!isNomeValido);


                    System.out.println("_____________");
                    System.out.println(linha);

                    break;
            }
        }while (opcao != 6);
    }


}