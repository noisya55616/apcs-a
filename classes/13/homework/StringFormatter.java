import java.util.List;
import java.util.ArrayList;

public class StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int sum = 0;
        for (int i = 0; i < wordList.size(); i++) {
            sum += wordList.get(i).length();
        }
        return sum;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        return formattedLen - basicGapWidth(wordList, formattedLen) * (wordList.size() - 1) - totalLetters(wordList);
    }

    public static String format(List<String> wordList, int formattedLen) {
        String ret = "";
        String gap = "";
        for (int i = 0; i < basicGapWidth(wordList, formattedLen); i++) gap += " ";
        int leftover = leftoverSpaces(wordList, formattedLen);
        for (int i = 0; i < wordList.size() - 1; i++) {
            ret += wordList.get(i) + gap;
            if (leftover > 0) {
                leftover--; ret += " ";
            }
        }
        ret += wordList.get(wordList.size() - 1);
        
        return ret;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("GREY");
        words.add("EGGS");
        words.add("AND");
        words.add("HAM");
        System.out.println(format(words, 20));
        List<String> words2 = new ArrayList<String>();
        words2.add("BEACH");
        words2.add("BALL");
        System.out.println(format(words2, 20));
    }
}
