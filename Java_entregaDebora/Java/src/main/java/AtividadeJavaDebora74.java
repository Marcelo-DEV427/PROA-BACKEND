package For;

public class Ex075 {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
    }
}


