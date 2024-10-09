import java.util.Arrays;

public class MergeSort {

    // Divide the array into smaller parts and then merge them in sorted order
    static int[] divide(int[] arr ) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        // divide left side from 0 to mid
        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));

        // and right side from mid to arr.length;
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted arrays
        return merge(left, right);
    }

    // function to Merge two sorted arrays
    static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int arr1Index = 0;
        int arr2Index = 0;
        int mergedArrayIndex = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] <= arr2[arr2Index]) { // using <= to ensure stability
                mergedArray[mergedArrayIndex++] = arr1[arr1Index++];
            } else {
                mergedArray[mergedArrayIndex++] = arr2[arr2Index++];
            }
        }

        // Add remaining elements
        while (arr1Index < arr1.length) {
            mergedArray[mergedArrayIndex++] = arr1[arr1Index++];
        }

        while (arr2Index < arr2.length) {
            mergedArray[mergedArrayIndex++] = arr2[arr2Index++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 3, 1, 6, 4, 2, 4, 561, 43, 5, 6};
        arr = divide(arr);
        System.out.print(Arrays.toString(arr) + " ");
    }
}
