package Exercicios4;
import java.util.Scanner;

public class At32Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");
        double nota = scanner.nextDouble();

        String conceito;
        if (nota < 0 || nota > 100) {
            conceito = "Nota inválida!";
        } else if (nota >= 90) {
            conceito = "A";
        } else if (nota >= 80) {
            conceito = "B";
        } else if (nota >= 70) {
            conceito = "C";
        } else if (nota >= 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Conceito: " + conceito);

    }
}