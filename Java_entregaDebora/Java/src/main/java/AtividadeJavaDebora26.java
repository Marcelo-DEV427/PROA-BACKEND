package Exercicios4;
import java.util.Scanner;

public class At34Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }

    }
}