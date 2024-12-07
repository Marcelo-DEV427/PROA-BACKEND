package For;

import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadePessoas = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break; // Sai do laço se o nome for "fim"
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            quantidadePessoas++;
        }

        if (quantidadePessoas > 0) {
            double mediaIdades = somaIdades / (double) quantidadePessoas;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
    }
}

