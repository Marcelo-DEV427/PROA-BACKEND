package MatrizJava;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] produto = new int[2][2]; // Matriz para armazenar o produto

        System.out.println("Digite os elementos da primeira matriz 2x2 (Matriz A):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2 (Matriz B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Produto das Matrizes A e B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
