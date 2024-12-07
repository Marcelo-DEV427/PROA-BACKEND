package Exercicios4;
import java.util.Scanner;

public class At33Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Digite o turno do aluno: ");
        char turno = sc.nextLine().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " +aluno );
        }else {
            System.out.println("Boa tarde, " +aluno );
        }
    }
}