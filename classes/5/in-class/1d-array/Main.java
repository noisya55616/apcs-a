import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int arr[] = new int[10]; // array of 10 elements. Cannot change the size of the array.

    for (int i = 0; i < arr.length; i++) {  // length of the array is accessed with arr.length
        System.out.print(arr[i] + "\t");    // Integer arrays are initialized to 0
    }

    System.out.print("\n");

    int arr2[] = {1, 2, 3, 4};  // you can initialize values this way

    for (int i = 0; i < arr2.length; i++) {
        System.out.print(ar2[i] + "\t");    
    }

    System.out.print("\n");

    for (int i = 0; i < 10; i++) {
        arr[i] = input.nextInt();
    }

    int sum = 0;

    for (int i = 0; i < 10; i++) {
        sum += arr[i];
    }

    int average = sum / 10;

    System.out.println("Values over the average: ");
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > average) System.out.print(arr[i] + "\t");
    }

    input.close();
  }
}