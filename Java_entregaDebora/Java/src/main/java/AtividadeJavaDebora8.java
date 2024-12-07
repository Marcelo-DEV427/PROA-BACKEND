package Exercicios2;
import java.util.Scanner;

public class At18Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Adulto");
        }
        else if (idade >= 14 ) {
            System.out.println("Adolecente");
        }
        else {
            System.out.println("Criança");
        }
    }
}
