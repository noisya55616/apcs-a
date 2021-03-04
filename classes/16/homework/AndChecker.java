public class AndChecker implements Checker {
    private Checker checker1;
    private Checker checker2;
    public AndChecker(Checker inChecker1, Checker inChecker2) {
        checker1 = inChecker1;
        checker2 = inChecker2;
    }

    public boolean accept(String text) {
        return checker1.accept(text) && checker2.accept(text);
    }
}
