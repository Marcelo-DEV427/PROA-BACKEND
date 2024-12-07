package Exercicios3;
import java.util.Scanner;

public class At30Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Número de maçãs? ");
        double n = sc.nextInt();

        if (n < 12){
            n = n * 0.50;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        } else {
            n = n * 0.40;
            System.out.printf("Valor a ser pago: " + "%.2f", n);
        }

    }
}