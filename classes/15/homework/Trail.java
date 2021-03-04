public class Trail {
    private int[] markers;

    public boolean isLevelTrailSegment(int start, int end) {
        int min = 0; int max = 0;
        min = markers[start]; max = markers[start];
        for (int i = start + 1; i <= end; i++) {
            if (markers[i] < min) min = markers[i];
            if (markers[i] > max) max = markers[i];
        }
        return (max - min) <= 10;
    }

    public boolean isDifficult() {
        int steps = 0;
        for (int i = 1; i < markers.length; i++) {
            int diff = markers[i] - markers[i - 1];
            if (diff >= 30 && diff <= 30) steps++;
        }

        return steps >= 3;
    }
}
