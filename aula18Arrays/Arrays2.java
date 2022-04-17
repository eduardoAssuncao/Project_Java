package aula18Arrays;
public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char '\u0000' ' '
        //boolean false;
        //referece null.
        String[] nomes= new String[3];
        nomes[0] = "Carlos";
        nomes[1] = "Gojou";
        nomes[2] = "Tomura";
        System.out.println(nomes.length);
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
