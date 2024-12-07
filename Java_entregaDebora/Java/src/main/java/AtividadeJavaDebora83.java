package VetoresJava;

import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int countPares = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                countPares++;
            }
        }

        System.out.println("A quantidade de números pares é: " + countPares);
    }
}

