public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int taget){
        int row = matrix.length;
        int col = matrix[0].length;

        int rowIndex = 0;
        int colIndex = col-1;

        while (rowIndex <= row && colIndex >=0) {
            // let take a corner Element

            int cornerElement = matrix[rowIndex][colIndex]; // 3

            if (taget == cornerElement) {
                return true;
            }
            if (taget < cornerElement) {
                colIndex--; // skip the column of larger elements
            }else{
                rowIndex++; // skip the row of smaller elements;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},  // only possible if column and row both in ascending order
                         {4,5,6},
                         {7,8,9}};
        int taget = 6; 

        System.out.println(SearchMatrix.searchMatrix(matrix, taget));
    }
}
