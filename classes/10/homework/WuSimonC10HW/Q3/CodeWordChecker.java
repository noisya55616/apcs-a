public class CodeWordChecker implements StringChecker {
    private int minLength, maxLength;
    private String banned;

    public CodeWordChecker(String s) {
        this.banned = s;
        this.minLength = 6;
        this.maxLength = 20;
    }

    public CodeWordChecker(int min, int max, String s) {
        this.minLength = min;
        this.maxLength = max;
        this.banned = s;
    }

    public boolean isValid(String str) {
        if (str.length() > maxLength || str.length() < minLength || str.indexOf(banned) != -1) return false;
        else return true;
    }

    public static void main(String[] args) {
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        StringChecker sc2 = new CodeWordChecker("pass");

        String[] arr1 = {"happy", "happy$", "Code", "happyCode"};
        String[] arr2 = {"MyPass", "Mypassport$", "happy", "1,000,000,000,000,000"};

        for (int i = 0; i < 4; i++) {
            System.out.println(sc1.isValid(arr1[i]));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(sc2.isValid(arr2[i]));
        }
    }
}
