public class MatrixAddition {

    // Function to add two matrices
    public static void addMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int rows = 2;
        int cols = 3;

        addMatrices(A, B, rows, cols);
    }
}