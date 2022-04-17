package classes;
public interface Controlador {
    public abstract boolean validarUsuario(String login, String password);
    public abstract int validarViagem(String origem, String destino);
    /*public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();*/
}
