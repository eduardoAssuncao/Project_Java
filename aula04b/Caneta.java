/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04b;

import javax.swing.SpringLayout;

/**
 *
 * @author Kenny
 */
public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
