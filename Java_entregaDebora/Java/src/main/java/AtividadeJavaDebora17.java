package Exercicios3;
import java.util.Scanner;

public class At26Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double precoProduto1 = 10.50;
        double precoProduto2 = 15.75;
        double precoProduto3 = 8.90;
        double precoProduto4 = 12.30;


        System.out.print("Digite o código do produto (1 a 4): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0.0;
        boolean codigoValido = true;

        switch (codigoProduto) {
            case 1:
                preco = precoProduto1;
                break;
            case 2:
                preco = precoProduto2;
                break;
            case 3:
                preco = precoProduto3;
                break;
            case 4:
                preco = precoProduto4;
                break;
            default:
                System.out.println("Código de produto inválido!");
                codigoValido = false;
        }

        if (codigoValido) {
            double valorTotal = preco * quantidade;
            System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);
        }

    }
}
