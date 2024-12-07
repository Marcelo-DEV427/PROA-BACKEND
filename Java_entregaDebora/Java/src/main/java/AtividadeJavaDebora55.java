package While2;

import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada: ");
        int n = sc.nextInt();
        int cont = 1;

        do {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }while (cont <= 10);

    }
}
