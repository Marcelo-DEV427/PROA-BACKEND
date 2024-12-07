package Exercicios3;
import java.util.Scanner;

public class At22Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario:");
        double salario = sc.nextDouble();

        double bonus;
        if (salario >= 2000) {
            bonus = salario * 0.10;
        }else {
            bonus = salario * 0.05;
        }
        System.out.println("Bonus: " + bonus);
    }
}
