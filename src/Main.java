import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Professor p = new Professor();
        Aluno a = new Aluno();

        Aluno aluno = new Aluno("Deborah", 12345);



        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a matrícula: ");
        int matriculaAluno = sc.nextInt();

    }
}