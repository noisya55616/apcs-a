public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        // Dummy implementation to return random values to test simulate method
        int hop = (int) Math.pow(Math.random() * 7.0, 2.0) - 10;
        return hop;
    }

    public boolean simulate() {
        int pos = 0;
        for (int i = 0; i < maxHops; i++) {
            pos += this.hopDistance();
            if (pos >= goalDistance) return true;
            if (pos < 0) return false;
        }
        return false;
    }

    public double runSimulations(int num) {
        double counter = 0.0;
        for (int i = 0; i < num; i++) {
            if (this.simulate()) counter++;
        }
        return counter / ((double) num);
    }

    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.runSimulations(100));
    }
}
