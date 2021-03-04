import java.util.ArrayList;

public class Digits
{
    /** The list of digits from the number used to construct this object.
    * The digits appear in the list in the same order in which they appear in the original number.
    */
    private ArrayList<Integer> digitList;
    /** Constructs a Digits object that represents num.
    * Precondition: num >= 0
    */
    public Digits(int num)
    {
        int n = num;
        digitList = new ArrayList<Integer>();

        while (n > 0) {
            digitList.add(n % 10);
            n /= 10;
        }

        for (int i = 0; i < digitList.size() / 2; i++) {
            int k = digitList.get(i);
            digitList.set(i, digitList.get(digitList.size() - 1 - i));
            digitList.set(digitList.size() - 1 - i, k);
        }
    }

    /**
     * This is just a testing method I wrote to check my answers afterwards
     */
    public void printNum() {
        for (int i = 0; i < digitList.size(); i++) {
            System.out.print(digitList.get(i));
        }
        System.out.print("\n");
    }

    /** Returns true if the digits in this Digits object are in strictly increasing order;
    * false otherwise.
    */
    public boolean isStrictlyIncreasing()
    { 
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i - 1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Digits num = new Digits(30421);

        num.printNum();
    }
}