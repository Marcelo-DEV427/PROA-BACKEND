package Exercicios;
import java.util.Scanner;

public class At3Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva a base do triangulo:");
        double base = entrada.nextDouble();

        System.out.println("Escreva a altura do triangulo:");
        double altura = entrada.nextDouble();

        double area = base*altura;
        System.out.println("Area do triangulo: "+area);


    }
}