package Dominio;

import Exceptions.NomeouSobrenomeInvalidoException;

public class Pet extends NomeouSobrenomeInvalidoException {
    private String nome_e_sobrenome;
    private TipoAnimal tipo;
    private Sexo sexo;
    private Endereco endereco;
    private int idade;
    private double peso;
    private String raça;

    public String getNome_e_sobrenome() {
        return nome_e_sobrenome;
    }

    public void setNome_e_sobrenome(String nome_e_sobrenome) {
        this.nome_e_sobrenome = nome_e_sobrenome;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
}
