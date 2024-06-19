package matrixmulusingarrays;

public class MatrixMul {
	// Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int columnsFirst = firstMatrix[0].length;
        int columnsSecond = secondMatrix[0].length;

        // Result matrix
        int[][] resultMatrix = new int[rowsFirst][columnsSecond];

        // Multiply matrices
        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < columnsSecond; j++) {
                for (int k = 0; k < columnsFirst; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


	public static void main(String[] args) {
		 // Example matrices
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] secondMatrix = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Check if matrices can be multiplied
        if (firstMatrix[0].length != secondMatrix.length) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        // Multiply matrices
        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        // Print the result
        System.out.println("Result of matrix multiplication:");
        printMatrix(resultMatrix);
		// TODO Auto-generated method stub

	}

}
