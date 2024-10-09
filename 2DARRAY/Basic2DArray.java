import java.util.Scanner;

public class Basic2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = 5;
        int row = 2;
        int[][] sample2D = new int[row][col]; // first [] = rows second [] = cols always

        System.out.println("Size of This 2D Array is " +sample2D.length);

        // Putting the elements
        for (int i = 0; i < row; i++) {  //  number of rows
            for (int j = 0; j < col; j++) {  // rows and col elements , no. of columns
                System.out.println("Enter the element of i = " +i +"th and j = " + j +"th term");
                sample2D[j][i] = sc.nextInt();
                // always remember that j should never itriate less than  i
            }
        }

        // Printing the elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sample2D[j][i] +" ");
            }
            System.out.println();
        }
        sc.close();
       
    }
}
