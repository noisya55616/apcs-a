public class Main {
    public static int binarySearch(int[] arr, int target) {
        int min = 0; int max = arr.length - 1; int mid = (min + max) / 2;
        while (min <= max) {
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) max = mid - 1;
            if (arr[mid] < target) min = mid + 1;
            mid = (min + max) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] intArr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(intArr1, 1));
        System.out.println(binarySearch(intArr1, -100));
    }
}
