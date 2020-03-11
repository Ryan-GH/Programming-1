public class Fibonacci {
    public static void main(String[] args) {
        int[] fib = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        System.out.print(fib[0] + " ");
        System.out.print(fib[1] + " ");

        for (byte i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}