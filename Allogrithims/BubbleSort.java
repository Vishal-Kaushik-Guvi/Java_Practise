import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {
      int n = arr.length;
      boolean swapped = true;
      while (swapped) { 
        swapped = false;
      for (int i = 0; i<n-1; i++) {
        if (arr[i] > arr[i+1]) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            swapped = true;
        }
    }
    if (swapped == false) {
        break;
    }
}
    return arr;
}
    public static void main(String args[]) {
        int[] array = {4,2,3,1,4,5,7,9};
        int[] result = BubbleSort.bubbleSort(array);
        System.out.println("Final Array " +Arrays.toString(result));
    }
}

// time = O(n) best
// worst = o(n2)