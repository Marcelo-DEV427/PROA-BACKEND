package PrimeiraAulaBasico;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        int i = 1;
        exibirTabuada(numero, i);
    }

    public static void exibirTabuada(int numero, int i) {
        if (i > 10) {
            return;
        }
        System.out.println(numero + " x " + i + " = " + (numero * i));
        exibirTabuada(numero, i + 1);
    }
}
