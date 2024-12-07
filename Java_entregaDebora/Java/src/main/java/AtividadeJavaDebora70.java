package For;
import java.util.Scanner;

public class Ex071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Divisores de " + numero + ":");

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

    }
}

