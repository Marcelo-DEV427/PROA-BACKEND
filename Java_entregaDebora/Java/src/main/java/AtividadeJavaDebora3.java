package Exercicios2;
import java.util.Scanner;

public class At12Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu peso:");
        double peso = entrada.nextDouble();

        System.out.println("Qual seu altura:");
        double altura = entrada.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("IMC: "+imc);
    }



}
