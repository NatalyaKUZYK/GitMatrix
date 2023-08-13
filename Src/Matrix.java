import java.util.Scanner;

public class Matrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість рядків (M): ");
            int m = scanner.nextInt();

            System.out.print("Введіть кількість стовпців (N): ");
            int n = scanner.nextInt();

            int[][] matrix1 = new int[m][n];
            int[][] matrix2 = new int[n][m];

            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Матриця:");
            printMatrix(matrix1);

            transposeMatrix(matrix1, matrix2);

            System.out.println("Транспонована матриця:" );
            printMatrix(matrix2);
        }

        public static void transposeMatrix(int[][] matrix1, int[][] matrix2) {
            int m = matrix1.length;
            int n = matrix1[0].length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[j][i] = matrix1[i][j];
                }
            }
        }

        public static void printMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

