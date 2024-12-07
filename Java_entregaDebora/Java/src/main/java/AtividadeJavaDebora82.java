package VetoresJava;

import java.util.Scanner;

public class Ex083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numeros = new int[7];
        int soma = 0;

        // Lê 7 números inteiros
        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        double media = soma / 7.0;

        System.out.println("A média aritmética dos números é: " + media);

    }
}

