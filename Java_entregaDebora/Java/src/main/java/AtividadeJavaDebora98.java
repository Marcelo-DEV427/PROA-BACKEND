package MatrizJava;

import java.util.*;

public class Ex099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] soma = new int[2][2];

        System.out.println("Digite os números da matriz 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite os números da matriz 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

    }
}
