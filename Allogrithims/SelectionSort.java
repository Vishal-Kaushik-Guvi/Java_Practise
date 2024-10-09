import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
      return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,4,3,6,7,9,0};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr)));
    }
}
// best or worst Time = O(n^2)
