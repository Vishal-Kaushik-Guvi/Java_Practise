import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int matrix[][]) {
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = matrix.length - 1; // for row last Element
        int colEnd = matrix[0].length - 1; // for column last Element

        List<Integer> result = new ArrayList<>(); // to store and return matrix element

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(matrix[rowBegin][i]);  // adding element 1,2,3
            }
            rowBegin++; // after adding all three elements move to next row

            for (int i = rowBegin; i <= rowEnd; i++) {
                 result.add(matrix[i][colEnd]); // 6,9
            }
            colEnd--; // after adding both elements move to right column

            if (rowBegin <= rowEnd) { // so array doesnt go out of bounds
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(matrix[rowEnd][i]); // 8,7
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) {
                // Traverse from bottom to top up the left column
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
                colBegin++; // Move right the left boundary
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 },
                           { 10, 11,12} };

         System.out.println(SpiralMatrix.spiralMatrix(matrix));                  

// -------------------------------------ROUGH--------------------------------------------------
        // int rowBegin = 0;
        // int colBegin = 0;
        // int rowEnd = matrix.length - 1; // for row last Element
        // int colEnd = matrix[0].length - 1;

        // System.out.println("RowBegin + RowEnd " +matrix[rowBegin][rowEnd]);
        // System.out.println("ColBegin + ColEnd " +matrix[colBegin][colEnd]);

        // System.out.println("RowBegin + ColBegin " +matrix[rowBegin][colBegin]);
        // System.out.println("ColBegin + RowBegin " +matrix[colBegin][rowBegin]);

        // System.out.println("RowEnd + ColEnd " +matrix[rowEnd][colEnd]);
        // System.out.println("ColEnd + RowEnd " +matrix[colEnd][rowEnd]);

        // System.out.println("RowBegin + ColEnd " +matrix[rowBegin][colEnd]);
        // System.out.println("ColBegin + RowEnd " +matrix[colBegin][rowEnd]);

    }
}
