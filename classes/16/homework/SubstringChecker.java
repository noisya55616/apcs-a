public class SubstringChecker implements Checker {
    private String substringMatch;

    public SubstringChecker(String in) {
        substringMatch = in;
    }

    public boolean accept(String text) {
        return (text.indexOf(substringMatch) != -1);
    }
}
