public class Static {
    public static void main(String[] args) {
        int x = 5, y = 2;
        int result = multiply(x, y);
        System.out.println(x + " * " + y + " = " + result);
        test(x,y);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void test (int x, int y) {
        System.out.println("this method does nothing. "+x+y);
    }
}