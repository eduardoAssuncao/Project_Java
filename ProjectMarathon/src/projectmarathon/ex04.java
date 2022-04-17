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
public class ex04 {

    public static void main(String[] args) {
        int diaS = 1;
        String status;
        if (diaS == 1 || diaS == 8) {
            status = "Final de semana";
        } else {
            status = "Dia util";
        }

        switch (diaS) {
            case 2: case 3: case 4: case 5: case 6: case 7:
                System.out.println(status);
                break;
            case 1: case 8: 
                System.out.println(status);
                break;
            default: 
                System.out.println("Opcao invalida");
                break;
        }
    }
}
