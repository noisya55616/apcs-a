import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int num = n;
    int temp = n;
    int count = 0;
    while(n > 0) {
      n = n / 10;
      count++;
    }
    
    Vector<Integer> v = new Vector<Integer>(count);    
    while(temp > 0){
      int digit = temp % 10;
      v.add(digit);
      temp = temp / 10;
      count--;
    }
    
    int sum = 0;

    for (int i = 0; i < v.size(); i++) {
      sum = sum + (int) Math.pow(v.get(i), 3);
    }

    if (sum == num) {
      System.out.println("cool");
    }
    else {
      System.out.println("not cool");
    }

  }
}