package Exercicios;
import java.util.Scanner;

public class At6Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("numero" + numero + "Par");
        }
        else {
            System.out.println("numero" + numero + "impar");
        }

    }
}