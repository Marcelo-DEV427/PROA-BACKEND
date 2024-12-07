package Exercicios2;
import java.util.Scanner;
public class At13Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        //fiz com ajuda
        if (num2 != 0 && num1%num2 == 0) {
            System.out.println("O primeiro multimplo do segundo");
        }else {
            System.out.println("O primeiro multimplo não é do segundo");
        }
    }
}
