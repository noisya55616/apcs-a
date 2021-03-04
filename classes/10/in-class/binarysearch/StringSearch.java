public class StringSearch {
    public static int binarySearch(String[] arr, String target) {
        int min = 0; int max = arr.length - 1; int mid = (min + max) / 2;
        while (min <= max) {
            if (arr[mid].equals(target)) return mid;
            if (arr[mid].compareTo(target) > 0) max = mid - 1; // If arr[mid] is more than target
            if (arr[mid].compareTo(target) < 0) min = mid + 1;
            mid = (min + max) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        String [] str = {"boy","cat","tiger","zebra"};
        System.out.println(binarySearch(str, "tiger"));
        System.out.println(binarySearch(str, "stephen"));
        System.out.println(binarySearch(str, "zebra"));
    }
}
