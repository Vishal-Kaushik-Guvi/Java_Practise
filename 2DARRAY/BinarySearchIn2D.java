public class BinarySearchIn2D {

    public static boolean binarySearchIn2D(int[][] matrix, int target){
       int row = matrix.length;
       int col = matrix[0].length;
       int totalSize = row*col;

       int s = 0;
       int e = totalSize - 1;

       while (s<=e) {
        int mid = s + (e-s)/2;

        int midElement = matrix[mid/col][mid%col];

        if (midElement == target) {
            return true;
        }
        if (target > midElement) {
            s = mid+1;
        }else{
            e = mid -1;
        }
       }
         return false;
    }
    public static void main(String[] args) {
       int[][] matrix= {{1,2,3},
                        {4,5,6},
                        {7,8,9}}; 
        System.out.println(BinarySearchIn2D.binarySearchIn2D(matrix, 1));
    }
}
