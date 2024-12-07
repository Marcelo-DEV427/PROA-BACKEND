package While;

public class At37Java {
    public static void main(String[] args) {


        int soma = 0, cont = 1;

        while (cont <= 100) {
            soma += cont;
            cont++;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}