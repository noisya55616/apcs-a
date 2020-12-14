import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> strList1 = new ArrayList<String>();

        strList1.add("Tiger");
        strList1.add("Banana");
        strList1.add("Cat");
        strList1.add("Mat");
        strList1.add("Bat");
        strList1.add("Elephant");

        int i = 0;
        while (i < strList1.size()) {
            if (strList1.get(i).length() == 3) strList1.remove(i);
            else i++;
        }

        for (int j = 0; j < strList1.size(); j++) {
            System.out.println(strList1.get(j));
        }

        input.close();
    }
}