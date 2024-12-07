package While2;

public class Ex062 {
    public static void main(String[] args) {

        int cont = 1;

        System.out.print("Números ímpares: ");
        do {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        } while (cont <= 50);
    }
}
