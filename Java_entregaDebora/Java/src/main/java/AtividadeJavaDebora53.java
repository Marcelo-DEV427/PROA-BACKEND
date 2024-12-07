package While2;

public class Ex053 {
    public static void main(String[] args) {

        int cont = 1;

        do {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }while (cont <= 50);
    }
}
