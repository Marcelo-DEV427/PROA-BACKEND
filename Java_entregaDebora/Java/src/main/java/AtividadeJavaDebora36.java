package While;
import java.util.Scanner;

public class At43Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        while (a <= limite) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
