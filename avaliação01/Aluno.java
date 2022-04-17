package avaliação01;

import java.io.ObjectInputStream;
import java.util.Scanner;

public class Aluno extends Pessoa{
    private float nota1;
    private float nota2;
    private float media;
    private float exame_final;
    private float media_final;
    private String disciplina;
    private String situacao;
    
    public Aluno(){
    
    }

    Scanner read = new Scanner(System.in);
    
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        try{
            if(nota1 > 0){
                this.nota1 = nota1;
        }
            else{
                throw new IllegalArgumentException("Nota inválida!");
            }
        }catch(IllegalArgumentException e){
            System.err.println("Exception: Houve um erro ao inserir nota " + e);
        }
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        try{
            if(nota1 > 0){
                this.nota2 = nota2;
        }
            else{
                throw new IllegalArgumentException("Nota inválida!");
            }
        }catch(IllegalArgumentException e){
            System.err.println("Exception: Houve um erro ao inserir nota " + e);
        }
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getExame_final() {
        return exame_final;
    }

    public void setExame_final(float exame_final) {
        this.exame_final = exame_final;
    }

    public float getMedia_final() {
        return media_final;
    }

    public void setMedia_final(float media_final) {
        this.media_final = media_final;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public float calcularMedia(float nota1, float nota2){
        this.media = (nota1 + nota2)/2;  
        return this.media;
    }
    
    public String vSituacaoAluno(float media){
        if(media >= 7){
            this.media_final = this.media;
            this.situacao = "Aprovado";
        }
        else if(media < 4) {
            this.situacao = "Reprovado";
            this.media_final = this.media;      
        }
        
        if(media >= 4 && media <= 6){
            System.out.println("Informe a nota do exame final:");
            exame_final = read.nextFloat();
            this.media_final = (media + exame_final)/2;
                if(media_final >= 6){
                    this.situacao = "Aprovado/Pós Exame Final";
                }else{
                    this.situacao = "Reprovado";
                }
        }    
        
        return this.situacao;
    }
    
    public void exibirHistorico(){
        System.out.println("Nome: "+ getNome() + " Email: "+ getEmail() + " Nota1: "+ getNota1() + " Nota2: " + getNota2() + " Média: " + getMedia() + " Exame Final: " + getExame_final() + " Média Final: " + this.media_final + " Disciplina: " + getDisciplina() + " Situação: " + situacao);
    }
 
}
