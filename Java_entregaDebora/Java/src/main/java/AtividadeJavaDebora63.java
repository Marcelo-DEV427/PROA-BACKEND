package While2;

import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        do {
            fatorial *= n;
            n--;
        } while (n > 0);
        System.out.println(fatorial);
    }
}
