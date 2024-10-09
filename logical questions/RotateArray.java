import java.util.Arrays;

public class RotateArray{
    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            // Trick to rotate array by k element, this approach is needed so that last index dont go out of bound
            temp[(k+i)%n] = arr[i];
        }
         arr = temp;
         System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8};
        int k = 2;
        RotateArray.rotateArray(arr, k);
    }
}