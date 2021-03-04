public class Recursion {
    public static int sumUp(int n) {
        if (n == 1) return 1;
        else return n + sumUp(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumUp(5));
    }
}
