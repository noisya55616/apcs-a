import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                WordPair wp = new WordPair(words[i], words[j]);
                allPairs.add(wp);
            }
        }
    }

    public int numMatches() {
        int ret = 0;
        for (int i = 0; i < this.allPairs.size(); i++) {
            if (this.allPairs.get(i).getFirst() == this.allPairs.get(i).getSecond()) ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] words = {"the", "red", "fox", "the", "red"};
        WordPairList example = new WordPairList(words);

        System.out.println(example.numMatches());
    }
}
