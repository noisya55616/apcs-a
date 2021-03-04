public class MergeSort {

    public static void merge(int[] result, int[] left, int[] right) {
        int m = 0, n = 0;
        for (int i = 0; i < result.length; i++) {
            if (m < left.length && n < right.length) {
                if (left[m] < right[n]) {
                    result[i] = left[m]; m++;
                }
                else if (left[m] > right[n]) {
                    result[i] = right[n]; n++;
                }
            }
            else if (m == left.length) {
                result[i] = right[n]; n++;
            }
            else if (n == right.length) {
                result[i] = left[m]; m++;
            }
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length >= 2) {
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    public static void main(String[] args) {

        int [] result = {-10,1,6, 10,12,100};
        mergeSort(result);
        for(int i = 0; i < 6; i++){
            System.out.print(result[i] +"\t");
        }
        System.out.println("");
    }
}