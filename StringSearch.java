public class StringSearch {
    public static int linearSearch(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String [] str = {"stephen","tiger","banana","elephant"};

        System.out.println(linearSearch(str, "tiger"));
        System.out.println(linearSearch(str, "stephen"));
        System.out.println(linearSearch(str, "donald"));
    }
}
