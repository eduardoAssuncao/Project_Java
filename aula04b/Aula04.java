
package aula04b;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f, true);
        c1.status();
        Caneta c2 = new Caneta("KIL", "Laranja", 1.5f, false);
        c2.status();
        /*c1.setModelo("BIC");
        //c1.modelo = "BIC"; Da erro pois é um atributo privado que só pode ser acessado pelos métodos get/set
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f; Da erro pois é um atributo privado que só pode ser acessado pelos métodos get/set
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        //c1.status();*/
    }
}
