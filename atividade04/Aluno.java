package atividade04;
public class Aluno {
    
    private String nomeAluno;
    private float notaExercicio;
    private float notaTrabalho;
    private float notaProva;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getNotaExercicio() {
        return notaExercicio;
    }

    public void setNotaExercicio(float notaExercicio) {
        this.notaExercicio = notaExercicio;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(float notaProva) {
        this.notaProva = notaProva;
    }
    
    public void calcularMedia(float pe, float pte, float pp){
        float mediaPonderada = 0;
        if(pe + pte + pp != 1){
            System.out.println("ERRO!!! Soma dos pesos diferente de 1");
        }else{
            mediaPonderada = ((notaExercicio * pe) + (notaTrabalho * pte) + (notaProva * pp))/(pe + pte + pp);
        }
        
        System.out.println("Média ponderada: "+ mediaPonderada);
    }
}
