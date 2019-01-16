public class SkyView {

    public double[][] view;
    int numRows;
    int numCols;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];

        int index = 0;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (r%2 == 0) {
                    view[r][c] = scanned[index];
                } else {
                    view[r][numCols - c - 1] = scanned[index];
                }

                index++;
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0;
        int count = 0;

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                total += view[r][c];
                count++;
            }
        }

        return total / count;
    }

}
