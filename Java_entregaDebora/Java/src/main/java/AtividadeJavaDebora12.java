package Exercicios3;
import java.util.Scanner;

public class At21Java {
    //Fiz com AJUDA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        int maiores = 0;
        int menores = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Digite a idade da pessoa:" +i);
            int idade = sc.nextInt();

            if (idade <18) {
                maiores++;
            }else{
                menores++;
            }
        }

        System.out.println("quantidade de menores"+menores);
        System.out.println("quabtidade de maiores"+maiores);


    }
}
