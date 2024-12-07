package VetoresJava;


import java.util.*;

public class Ex090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int cont = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero == 0) {
                cont++;
            }

        }
        System.out.println("Existe " + cont + " números igual a zero: ");
    }
}
