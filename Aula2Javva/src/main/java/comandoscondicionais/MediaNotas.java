package comandoscondicionais;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        float n1, n2, n3, n4, media;


        Scanner nota = new Scanner(System.in);


        System.out.print("Entre com a primeira nota: ");
        n1 = nota.nextFloat();


        System.out.print("Entre com a segunda nota: ");
        n2 = nota.nextFloat();


        System.out.print("Entre com a terceira nota: ");
        n3 = nota.nextFloat();

        System.out.print("Entre com a quarta nota: ");
     n4 = nota.nextFloat();


        media = (n1 + n2 + n3 + n4) / 4;


        System.out.printf("A média das notas é: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Você passou, vai tomando!");
        }else if (media >=5){
            System.out.println("Você está de recuperação!");

            }else{
            System.out.println("Então burro você está reprovado!");

        }


    }
}
