package VetoresJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int cont = 0;

        for (int c = 1; c <= 7; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        System.out.println("Apenas os números pares: " + list);
    }
}