package While;
import java.util.Scanner;

public class At44Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1;
        double soma = 0;

        while (n <= 5) {
            System.out.print("Digite o nome da " + n + " pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da " + n + " pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;

            n++;
        }
        System.out.printf("A media das idades é: %.2f", soma/5);
    }
}
