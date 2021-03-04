public class Phrase
{
    private String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
        currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
    * returns -1 if the nth occurrence does not exist.
    * Precondition: str.length() > 0 and n > 0
    * Postcondition: the current phrase is not modified.
    */
    public int findNthOccurrence(String str, int n)
    {
        int cnt = 0;

        for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
            if (str.equals(currentPhrase.substring(i, i + str.length()))) cnt++;
            if (cnt == n) return i;
        }

        return -1;
    }

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
    * If the nth occurrence does not exist, the current phrase is unchanged.
    * Precondition: str.length() > 0 and n > 0
    */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int idx = this.findNthOccurrence(str, n);
        if (idx != -1) {
            currentPhrase = currentPhrase.substring(0, idx) + repl + currentPhrase.substring(idx + str.length(), currentPhrase.length());
        }
    }

    /** Returns the index of the last occurrence of str in the current phrase;
    * returns -1 if str is not found.
    * Precondition: str.length() > 0
    * Postcondition: the current phrase is not modified.
    */
    public int findLastOccurrence(String str)
    {
        if (currentPhrase.indexOf(str) == -1) return -1;
        else {
            int n = 1;
            while (this.findNthOccurrence(str, n + 1) != -1) {
                n++;
            }
            return this.findNthOccurrence(str, n);
        }
    }

    /** Returns a string containing the current phrase. */
    public String toString()
    { return currentPhrase; }

    public static void main(String[] args) {
        Phrase p = new Phrase("Jimmy likes cats, but Catherine surprisingly does not.");
        System.out.println(p.findNthOccurrence("cat", 1));
        p.replaceNthOccurrence("cats", 1, "dogs");
        System.out.println(p.toString());
        System.out.println(p.findNthOccurrence("in", 1));
        System.out.println(p.findLastOccurrence("in"));
    }
}