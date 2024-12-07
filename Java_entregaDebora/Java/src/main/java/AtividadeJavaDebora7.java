package Exercicios2;
import java.util.Scanner;

public class At17Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();

        if (num>0){
            System.out.println("Numero positivo");
        }else if (num<0){
            System.out.println("Numero negativo");
        }else if (num==0){
            System.out.println("Numero zero");
        }
    }
}
