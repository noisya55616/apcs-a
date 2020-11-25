import java.io.*;
import java.util.*; 

public class Main {
    public static int arraySum(int arr[]) { // this is the syntax. pretty simple
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static boolean isAllOdd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) return false;
        }
        return true;
    }

    public static boolean isUnique(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr1[] = {1, 2, 3, 4};  // sum is 10
    System.out.println("Sum is " + arraySum(arr1));
    System.out.println("Does the array only have odd numbers? " + isAllOdd(arr1));
    System.out.println("Are all of the elements unique? " + isUnique(arr1));
    input.close();
  }
}