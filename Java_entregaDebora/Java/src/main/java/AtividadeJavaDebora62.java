package While2;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.print("Dígitos separados: ");

        int divisor = 1;
        do {
            divisor *= 10;
        }while (numero / divisor >= 10);

        do {
            System.out.print(numero / divisor + " ");
            numero %= divisor;
            divisor /= 10;
        } while (divisor > 0);
    }
}