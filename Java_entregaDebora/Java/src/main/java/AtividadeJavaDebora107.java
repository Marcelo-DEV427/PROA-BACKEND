package MatrizJava;

import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior valor da linha " + (i + 1) + ": " + maior);
        }

    }
}