/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDupla;

/**
 *
 * @author Kenny
 */
public class ListaDupla {
    Node inicio;
    Node fim;
    int tamanho;

    public void adiciona(String info){ // adiciona no fim da lista
        Node no = new Node();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;
        if (inicio != null){
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0){
            fim = inicio;
        }
        tamanho++;
    }
    
    public static void main(String[] args) {
        ListaDupla l = new ListaDupla();
        
        System.out.println(l);

        for (int i = 0; i < 6; i++){
            l.adiciona("" + (char) (i + 97));
            System.out.println(l);
        }
    }
}

   
