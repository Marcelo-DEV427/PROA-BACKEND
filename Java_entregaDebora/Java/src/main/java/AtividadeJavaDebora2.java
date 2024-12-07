package Exercicios2;
import java.util.Scanner;

public class At11Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dgite o primeiro numero:");
        double num1 = entrada.nextDouble();

        System.out.println("Dgite o segundo numero:");
        double num2 = entrada.nextDouble();

        System.out.println("Dgite o terceiro numero:");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("Sua media é:" + media);


    }
}
