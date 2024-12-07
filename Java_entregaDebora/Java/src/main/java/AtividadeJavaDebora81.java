package VetoresJava;

import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);

    }
}

