public class MatrixAddition {
    public static void main(String[] args) {

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[3][3];

        for (int row = 0; row < matrixA.length; row++) {

            for (int col = 0; col < matrixA[row].length; col++) {

                result[row][col] = matrixA[row][col]
                        + matrixB[row][col];
            }
        }

        System.out.println("MATRIX A");

        displayMatrix(matrixA);

        System.out.println("\nMATRIX B");

        displayMatrix(matrixB);

        System.out.println("\nRESULT (A + B)");

        displayMatrix(result);
    }

    public static void displayMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }
}
