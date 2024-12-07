package MatrizJava;

import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Digite os números:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

            }
        }
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }
        System.out.println("soma dos elementos da diagonal principal: " + soma);

    }
}
