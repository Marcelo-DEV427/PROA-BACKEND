package PrimeiraAulaBasico;  // Pacote para organização das classes

import java.util.Scanner;  // Referência à biblioteca Util do Java (Scanner)

public class Primeiraaula {  // Definição da classe pública PrimeiraAula

    public static void main(String[] args) {  // Método principal para execução da classe

        // Criação de um objeto Scanner para entrada de dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita o primeiro número e armazena em 'numero'
        System.out.println("Entre com o primeiro numero: ");
        int numero = entrada.nextInt();

        // Solicita o segundo número e armazena em 'numero2'
        System.out.println("Entre com o segundo numero: ");
        int numero2 = entrada.nextInt();

        // Calcula a soma dos dois números
        int soma = numero + numero2;

        // Exibe os valores e a soma
        System.out.println("O valor do primeiro número é: " + numero);
        System.out.println("O valor do segundo número é: " + numero2);
        System.out.println("A soma dos dois números é: " + soma);

        // Fechar o scanner para liberar recursos
        entrada.close();
    }
}
