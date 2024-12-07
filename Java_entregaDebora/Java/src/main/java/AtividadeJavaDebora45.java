package Exercicios;
import java.util.Scanner;

public class At5Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valoe do produto:");
        double preco = entrada.nextDouble();

        System.out.println("Quantidade de produtos:");
        int quantidade = entrada.nextInt();

        double total = preco * quantidade;

        if (quantidade > 10){
            total = total*0.90;
        }

        System.out.println("O valor total é: " + total);

    }
}