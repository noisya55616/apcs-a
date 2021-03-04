import java.util.Scanner;

public class ElevensTester {
    public static void main(String[] args) {
        Card c1 = new Card("2", "D", 2);
        Card c2 = new Card("2", "D", 2);

        System.out.println(c1.toString());
        System.out.println(c1.matches(c2));
    }
}
