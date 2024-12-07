package Exercicios2;
import java.util.Scanner;

public class At19Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O numero maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O numero maior é: " + num2);
        }
        else{
            System.out.println("Numeros iguais");
        }
    }
}
