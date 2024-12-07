package Exercicios;
import java.util.Scanner;

public class At4Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota*2 + nota2* + nota3*5) / 2+3+5;

        System.out.println("A media é: " + media);
        //ajuda do gpt, sou horrivel em matematica.

    }
}