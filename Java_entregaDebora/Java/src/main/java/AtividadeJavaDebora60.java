package While2;

public class Ex060 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 0;
        int limit = 20;

        System.out.println("Os primeiros " + limit + " números da sequência de Fibonacci são:");
        do {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            count++;
        } while (count < limit);

        System.out.println();
    }
}
