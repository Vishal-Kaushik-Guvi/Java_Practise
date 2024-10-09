import java.util.Scanner;

public class LinearSearchIn2D {

    public static void linearSearch(int[][] arr, int target){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Tager is at " +i +"th row " +j +"th index");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        LinearSearchIn2D.linearSearch(arr, target);
        sc.close();
    }
}