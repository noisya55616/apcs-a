import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> wordBank;

    public RandomStringChooser() {
        wordBank = new ArrayList<String>();
    }

    public RandomStringChooser(String[] arr) {
        wordBank = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            wordBank.add(arr[i]);
        }
    }

    public String getNext() {
        if (wordBank.isEmpty()) return "NONE";
        else {
            int k = (int) (Math.random() * wordBank.size());
            String ret = wordBank.get(k);
            wordBank.remove(k);
            return ret;
        }
    }

    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
    }
}