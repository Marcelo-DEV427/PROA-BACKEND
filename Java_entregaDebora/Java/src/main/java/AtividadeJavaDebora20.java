package Exercicios3;
import java.util.Scanner;

public class At29Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome do aluno? ");
        String nome = sc.nextLine();

        System.out.print("Digite um a nota do aluno:  ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("O aluno " + nome + "aprovado!");
        }else {
            System.out.println("O aluno " + nome + " recuperção!");
        }

    }
}