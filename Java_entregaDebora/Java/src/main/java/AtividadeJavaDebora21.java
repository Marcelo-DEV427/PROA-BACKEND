package Exercicios;
import java.util.Scanner;

public class At2Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o Raio do circulo:");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);//ajuda do gpt
        double perimetro = 2 * Math.PI * raio;

        System.out.println("A area do circulo é: " + area);
        System.out.println("O perimetro do cirulo é: " + perimetro);


    }
}