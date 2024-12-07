package Exercicios;
import java.util.Scanner;
public class At1Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = entrada.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("soma = " + soma);
        System.out.println("subtracao = " + subtracao);
        System.out.println("multiplicacao = " + multiplicacao);
        System.out.println("divisao = " + divisao);
    }
}
