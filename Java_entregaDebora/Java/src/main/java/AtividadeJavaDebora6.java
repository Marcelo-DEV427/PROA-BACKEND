package Exercicios2;
import java.util.Scanner;

public class At16Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salario atual:");
        double salario = sc.nextDouble();

        double salarion = salario + (salario *0.15);

        System.out.println("O novo Salario: " + salarion);
    }
}
