package For;

import java.util.Scanner;

public class Ex073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro maior que 0.");
        } else {
            int a = 0, b = 1;

            System.out.print("Sequência de Fibonacci até " + numero + ": ");
            System.out.print(a + " ");

            while (b <= numero) {
                System.out.print(b + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }

            System.out.println();
        }
    }
}

