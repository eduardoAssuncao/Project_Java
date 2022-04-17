package classes;
public class Usuario implements Controlador{
    
    @Override
    public boolean validarUsuario(String login, String password) {
        if(login.equals("SemAdmin") && password.equals("ComAdmin")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int validarViagem(String origem, String destino) {
        if(origem.equals("sao luis") && destino.equals("sao paulo"))
        {
            return 1;
        }
        
        if(origem.equals("sao luis") && destino.equals("bacabal"))
        {
            return 2;
        }
                
        if (origem.equals("sao luis") && destino.equals("teresina"))
        {
            return 3;
        }
        
        return 0;
    }
}
