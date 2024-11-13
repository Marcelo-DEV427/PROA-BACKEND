package comandoscondicionais;
import java.util.Scanner;

public class Calculoimc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu peso: ");
        float peso = scanner.nextFloat(); //

        System.out.println("Entre com a sua altura (em metros): ");
        float alturaM = scanner.nextFloat();

        // Cálculo do IMC
        float imc = peso / (alturaM * alturaM);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com peso ideal. Parabéns!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você está com obesidade grau I.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Você está com obesidade grau II (severa).");
        } else {
            System.out.println("Você está com obesidade grau III (mórbida).");
        }
    }
}
