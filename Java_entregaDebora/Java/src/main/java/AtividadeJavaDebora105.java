package MatrizJava;

import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        boolean iguais = true;

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
                if (matrizA[i][j] != matrizB[i][j]) {
                    iguais = false;
                    break;
                }
            }
        }

        if (iguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }

    }
}
