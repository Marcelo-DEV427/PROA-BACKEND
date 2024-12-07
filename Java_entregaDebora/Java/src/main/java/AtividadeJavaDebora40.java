package While;
import java.util.Scanner;

public class At47Java {
    public static void main(String[] args) {

        int cont = 1;

        System.out.print("Números ímpares: ");
        while (cont <= 50) {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}
