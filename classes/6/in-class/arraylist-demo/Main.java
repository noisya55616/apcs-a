import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    // Declaring an ArrayList: integers

    ArrayList<Integer> intList1 = new ArrayList<Integer>(); // Declare using the object name

    ArrayList<Double> dblList1 = new ArrayList<Double>();

    ArrayList<String> strList1 = new ArrayList<String>();

    intList1.add(12);

    intList1.add(13);

    int[] intArr1 = {12, 13};

    System.out.println(intArr1); // Prints a memory location/pointer

    System.out.println(intList1); // Prints the list of numbers!

    System.out.println(intList1.get(0)); // Access an element at an index. ArrayLists are 0-indexed.

    intList1.add(0, 10); // Add 10 at index 0! 

    System.out.println(intList1);

    intList1.add(1, 11); // Add 11 at index 1!

    System.out.println(intList1); // Adding an item at an index will push all the other elements ahead.

    System.out.println(intList1.size()); // size and not length! this isn't an array.

    System.out.println(intList1.indexOf(13));

    System.out.println(intList1.indexOf(100)); // Will return -1

    intList1.set (0, 100);

    System.out.println(intList1); // if you use set, you will **replace** the element at that index.

    intList1.remove(3); // Remove an item at a specified index.

    System.out.println(intList1); // All of the other elements are shifted over!

    System.out.println(intList1.isEmpty()); // Determines if it's empty or not.

    input.close();
  }
}