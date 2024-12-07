package VetoresJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("Números na ordem inversa:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}


