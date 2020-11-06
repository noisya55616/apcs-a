import java.io.*; 
import java.util.*; 

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int time = input.nextInt();
    int[] offsets = {0, -300, -200, -100, 0, 100, 130};
	String[] cityNames = {"Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax", "St. John's"};

	for (int i = 0; i < 7; i++) {
		int temp = time + offsets[i];
		if (temp < 0) temp += 2400;
		if (temp % 100 >= 60) temp += 40;
		if (temp >= 2400) temp -= 2400;
		System.out.println(temp + " in " + cityNames[i]);
	}
	input.close();
  }
}