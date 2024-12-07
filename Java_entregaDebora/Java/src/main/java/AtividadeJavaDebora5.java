package Exercicios2;
import java.util.Scanner;

public class At15Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos");
        int anos = sc.nextInt();

        System.out.println("Digite sua idade em meses");
        int meses = sc.nextInt();

        System.out.println("Digite sua idade em dias");
        int dias = sc.nextInt();

        int Totaldias = (anos*365) + (meses*30) + (dias);
        System.out.println(Totaldias);
    }
}
