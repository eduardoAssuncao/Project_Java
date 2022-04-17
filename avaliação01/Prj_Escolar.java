package avaliação01;

import java.util.Scanner;

public class Prj_Escolar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Aluno a1 = new Aluno();
        System.out.println("Informe o seu nome:");
        a1.setNome(read.nextLine());
        System.out.println("Informe o seu email:");
        a1.setEmail(read.nextLine());
        System.out.println("Informe o seu código:");
        a1.setCodigo(read.nextDouble());
        System.out.println("Informe a disciplina:");
        a1.setDisciplina(read.next());
        System.out.println("Informe a sua primeira nota:");
        a1.setNota1(read.nextFloat());
        System.out.println("Informe a sua segunda nota:");
        a1.setNota2(read.nextFloat());
        a1.calcularMedia(a1.getNota1(), a1.getNota2());    
        a1.vSituacaoAluno(a1.getMedia());
        a1.exibirHistorico();
        
        Professor p1 = new Professor();
        System.out.println("infoem o seu nome:");
        p1.setNome(read.next());
        System.out.println("Informe o seu email:");
        p1.setEmail(read.next());
        System.out.println("Informe o seu código:");
        p1.setCodigo(read.nextDouble());
        System.out.println("Informe a área de atuação:");
        p1.setArea_atuação(read.next());
        System.out.println("Informe a quantidade de horas da disciplina:");
        p1.setQtde_horas_disciplina(read.nextFloat());
        System.out.println("Informe o valor da hora trabalhada:");
        p1.setValor_hora_trabalhada(read.nextFloat());
        p1.calcularSalario(p1.getValor_hora_trabalhada(), p1.getQtde_horas_disciplina());
        p1.calcularBonus();
        p1.exibirDadosProfessor();
        
        //Desculpe-me caso tenha esquecido alguma coisa.. Acabei me atrapalahdno com o horário
    }
}
