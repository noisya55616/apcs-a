public class MultPractice implements StudyPractice {
    private int first, second;

    public MultPractice(int f, int s) {
        first = f;
        second = s;
    }

    public String getProblem() {
        return first + " TIMES " + second;
    }

    public void nextProblem() {
        second += 1;
    }

    public static void main(String[] args) {
        StudyPractice p1 = new MultPractice(7, 3);
        System.out.println(p1.getProblem()); 

        p1.nextProblem();
        System.out.println(p1.getProblem());

        p1.nextProblem();
        System.out.println(p1.getProblem());

        p1.nextProblem();
        System.out.println(p1.getProblem()); 
    }
}