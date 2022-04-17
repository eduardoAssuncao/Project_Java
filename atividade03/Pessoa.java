/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author Kenny
 */
public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float imc(float peso, float altura){
        float operacao = (peso)/(altura*altura);
        return operacao;
    }
    

    @Override
    public String toString() {
        return "Pessoa " + "nome = " + nome + ", peso = " + peso + ", altura = " + altura + ", idade=" + idade + ", IMC=" + imc(peso, altura);
    }
    
    
    
}
