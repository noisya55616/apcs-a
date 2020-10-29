import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int order = input.nextInt(); int bags = order;
	int large = 0, medium = 0, small = 0;

	if (bags >= 20) {
		large = (bags - (bags % 20)) / 20;
		bags -= large * 20;
	}

	if (bags >= 10) {
		medium = (bags - bags % 10) / 10;
		bags -= medium * 10;
	}

	if (bags > 0) {
		small = (bags - bags % 5) / 5;
		bags -= small * 5;
		if (bags > 0) small += 1;
	}

	int cost = order * 550 + large * 180 + medium * 100 + small * 60;
	int dollars = (cost - cost % 100) / 100;
	int cents = cost % 100;
	System.out.print("Number of Bags Ordered : " + order + " $ " + dollars + "." + cents);
	if (cents == 0) System.out.print("0\n\n");
	else System.out.print("\n\n");
	
  }
}