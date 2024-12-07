package While;
import java.util.Scanner;

public class At39Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int cont = 1, soma = 0;

        while (cont <= 5){
            System.out.print("Digite o " + cont +" número");
            int num = sc.nextInt();
            soma += num;
            cont++;
        }
        System.out.println("A media aritmetica é: " + soma / 5);
    }
}
