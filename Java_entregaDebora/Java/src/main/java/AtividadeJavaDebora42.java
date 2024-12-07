package While;
import java.util.Scanner;

public class At49Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        while (n > 0) {
            fatorial *= n;
            n--;
        }
        System.out.println(fatorial);
    }
}