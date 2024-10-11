public class RowAndColumnSum {

    public static void rowSum(int[][] arr){
        int rowSum = 0;
        for (int i = 0; i < 3; i++) {
              rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += arr[i][j];
            }
            System.out.println();
           System.out.println(rowSum);
        }
    }

    // public static void colSum(int[][] arr){
    //     int colSum = 0;
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //         }
    //         //  colSum 
    //         // System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
         RowAndColumnSum.rowSum(arr);
    }
}
