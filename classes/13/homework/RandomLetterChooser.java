import java.util.Random;

public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }

        return arr;
    }

    public static void main(String[] args) {
        String word = "cat";
        RandomStringChooser sChooser = new RandomLetterChooser(word);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
    }
}
