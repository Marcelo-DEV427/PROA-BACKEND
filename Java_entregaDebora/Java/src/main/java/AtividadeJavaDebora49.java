package Exercicios;
import java.util.Scanner;
//ajuda do gpt
public class At9Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do Deposito:");
        double deposito = entrada.nextDouble();

        System.out.println("Digite a taxa de juros:");
        double taxa = entrada.nextDouble();

        taxa = taxa /100;
        double montante = 0;

        for (int i = 0; i < taxa; i++) {
            montante = (montante+deposito)*(1+taxa);
            System.out.printf("O montante após 12 meses será: R$ %.2f\n", montante);
        }
    }
}