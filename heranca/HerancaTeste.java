package heranca;

public class HerancaTeste {

    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Guilda");
//        p.setCpf("444876");
        Endereco end = new Endereco();
//        end.setBairro("Bairro 2");
        end.setRua("Rua 26");
//        p.setEndereco(end);
        //p.imprime();
        System.out.println("------------------------");
        Funcionario f = new Funcionario("Carlos");
        f.setCpf("887746");
        f.setSalario(4500);
        f.setEndereco(end);
        //f.imprime();
        
    }
}
