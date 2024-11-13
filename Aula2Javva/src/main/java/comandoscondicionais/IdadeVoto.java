package comandoscondicionais;

import java.util.Scanner;

public class IdadeVoto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 69) {
            System.out.println("Você pode votar!");
        } else if (idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Você pode votar, mas o voto é facultativo.");
        } else {
            System.out.println("Você não pode votar.");
        }

        scanner.close();
    }
}
