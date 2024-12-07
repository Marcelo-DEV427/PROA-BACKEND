package VetoresJava;

import java.util.*;

public class Ex087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.

        List<Integer> list = new ArrayList<Integer>();
        int cont = 0;

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero > 0) {
                cont++;
            }

        }
        System.out.println("Quantidade de números positivos: " + cont);
    }
}
