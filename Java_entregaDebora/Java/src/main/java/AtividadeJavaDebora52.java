package While2;

public class Ex052 {
    public static void main(String[] args) {

        int soma = 0, cont = 1;

        do {
            soma += cont;
            cont++;
        } while (cont <= 100);

        System.out.println("A soma dos números é: " + soma);
    }
}