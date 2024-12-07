package Exercicios2;
import java.util.Scanner;

public class At20Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();


        double media = (nota + nota2 + nota3) / 3;
        System.out.println("Sua media é:" + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}
