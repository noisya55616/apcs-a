public class cyu2 {
    public static int sum(int m, int n) {
        if (m == n) return n;
        else return m + sum(m + 1, n);
    }

    public static void main(String[] args) {
        System.out.println(sum(1,100));
        System.out.println(sum(1,1));
        System.out.println(sum(1,10));
    }
}
