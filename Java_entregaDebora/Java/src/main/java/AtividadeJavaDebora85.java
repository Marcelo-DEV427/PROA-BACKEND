package VetoresJava;

import java.util.*;

public class Ex086 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = entrada.nextInt();
            lista.add(num);
        }
        System.out.println("Lista: " + lista);
        Collections.sort(lista);
        System.out.println("Em ordem crescente: " + lista);
    }
}
