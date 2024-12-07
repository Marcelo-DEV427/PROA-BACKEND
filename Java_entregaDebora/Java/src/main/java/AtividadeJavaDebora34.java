package While;
import java.util.Scanner;

public class At41Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int cont = 1;

        System.out.print("Os divisores desse número são: ");
        while (cont <= n) {
            if (n % cont == 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}