/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmarathon;

/**
 *
 * @author Kenny
 */
public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
                nomes[0] = "Naruto";
                nomes[1] = "Goku";
                nomes[2] = "Luffy";
                
                for (int i = 0; i < nomes.length; i++) {//length retorna o tamanho do array
                    System.out.println((i+1)+" nome "+nomes[i]);
            
        }
    }
}
