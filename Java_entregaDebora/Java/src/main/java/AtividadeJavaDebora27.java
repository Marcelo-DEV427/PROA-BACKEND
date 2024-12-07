package Exercicios4;
import java.util.Scanner;

public class At35Java {
    //Fiz com AJUDA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}