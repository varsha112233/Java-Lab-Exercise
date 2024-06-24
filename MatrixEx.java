package matrixmulusingarrays;
import java.util.Scanner;


public class MatrixEx {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for matrix A:");
        int rowsA = scanner.nextInt();
        
        System.out.println("Enter the number of columns for matrix A:");
        int colsA = scanner.nextInt();
        
        System.out.println("Enter the number of rows for matrix B:");
        int rowsB = scanner.nextInt();
        
        System.out.println("Enter the number of columns for matrix B:");
        int colsB = scanner.nextInt();
        
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }
        
        System.out.println("Enter elements of matrix A:");
        int[][] matrixA = inputMatrix(rowsA, colsA, scanner);
        
        System.out.println("Enter elements of matrix B:");
        int[][] matrixB = inputMatrix(rowsB, colsB, scanner);
        
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        
        System.out.println("Result of matrix multiplication:");
        displayMatrix(resultMatrix);
        
        scanner.close();
    }
    
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        
        int[][] resultMatrix = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return resultMatrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
