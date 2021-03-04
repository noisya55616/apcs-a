public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];

        int i = 0, j = 0, k = 0, m = 1;
        
        while (k < scanned.length) {
            view[i][j] = scanned[k];
            k++;
            if (i == 0) {
                m = 1;
                j++;
            }
            else if (i == numRows - 1) {
                m = -1;
                j++;
            }
            else {
                i += m;
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
            }
        }
        return sum / ((endRow - startRow + 1) * (endCol - startCol + 1));
    }
}
