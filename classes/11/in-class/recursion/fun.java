public class fun {
    public static void fun1(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            fun1(n / 10);
        }
    }
    public static void fun2(int n) {
        if (n > 0) {
            fun2(n / 10);
            System.out.print(n % 10);
        }
    }
    public static void main(String[] args) {
        fun1(123); // Reverse digit printer!
        System.out.print("\n");
        fun2(2345);
    }
}
