import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int test = input.nextInt(); int score = input.nextInt();
	double[] weights = {0.1, 0.2, 0.2, 0.15, 0.15, 0.2};
	System.out.println("A score of " + score + " on test " + test + " gives a weighted score of " + (weights[test-1] * score));
	input.close();
  }
}