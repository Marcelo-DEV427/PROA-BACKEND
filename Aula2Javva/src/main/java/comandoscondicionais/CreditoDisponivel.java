package comandoscondicionais;

import java.util.Scanner;

public class CreditoDisponivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu saldo médio: ");
        int saldoMedio = scanner.nextInt();

        int valorCredito;
        if (saldoMedio <= 500) {valorCredito = 0;
        } else if (saldoMedio <= 1000) {
            valorCredito = saldoMedio * 30 / 100;
        } else if (saldoMedio <= 3000) {
            valorCredito = saldoMedio * 40 / 100; 
        } else {
            valorCredito = saldoMedio * 50 / 100;
        }

        System.out.printf("O valor de crédito disponível é: R$ %d", valorCredito);
    }
}
