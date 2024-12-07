package Exercicios;
import java.util.Scanner;

public class At7Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario:");
        double salario = entrada.nextDouble();

        double comissao = salario * 0.05;

        double total = salario + comissao;

        System.out.println("O salario liquido é:" + total);

    }
}