// package exercise_10;

import java.util.Arrays;

public class Transpose {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    // 1. Create a new, empty, soon-to-be transpose matrix
    int[][] transposeMatrix = new int[matrix.length][matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        // 2. matrix[i][j] = matrix[j][i];
        transposeMatrix[i][j] = matrix[j][i];
      }
    }

    System.out.println();

    // 3. printMatrix(matrix);
    printMatrix(transposeMatrix);
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
