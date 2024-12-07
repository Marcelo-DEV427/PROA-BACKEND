package VetoresJava;

import java.util.*;

public class Ex091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int positivo = 0, negativo = 0;

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero > 0) {
                positivo+= numero;
            }else{
                negativo+= numero;
            }

        }
        System.out.println("Positivos: " + positivo + " Negativos: " + negativo);
    }
}
