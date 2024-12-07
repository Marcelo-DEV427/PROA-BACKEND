package Exercicios;
import java.util.Scanner;

public class At10Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada:");
        int valorTabuada = entrada.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(valorTabuada * i);
        }
    }
}