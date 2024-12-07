package For;

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int count = 5;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 1; i <= count; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / (double) count;

        System.out.println("A média aritmética dos valores lidos é: " + media);

    }
}

