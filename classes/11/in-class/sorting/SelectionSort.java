public class SelectionSort {
    public static int[] selectionSort(int[] in) {
        int[] arr = in;
        for (int i = arr.length - 1; i > 0; i--) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 10, 24, 1, 10};

        int[] sarr = selectionSort(arr);

        for (int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }
    }
}