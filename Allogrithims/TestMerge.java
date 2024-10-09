import java.util.Arrays;

public class TestMerge {

    static int[] Divide(int[] arr, int s, int e){
      int start = s;
      int end = e;

      int mid = s + (e-s)/2;

      if (arr.length < 1) {
        return arr;
      }

      int[] left = Divide(arr, start, mid); // 5 ,6, 3
      int[] right = Divide(arr, mid+1, end); // 4 ,2 ,1

      return Merge(left, right);

    }

    static int[] Merge(int[] left, int[] right){

        int len1 = left.length;
        int len2 = right.length;
        int mergelen = len1 + len2;

        int leftIdx = 0;
        int rightIdx = 0;
        int mergeIdx = 0;

        int[] megrgeArray =new int[mergelen];
      

        while (leftIdx <= len1 && rightIdx <= len2 ) {
            if (left[leftIdx] < right[rightIdx]) {
                megrgeArray[mergeIdx++] = left[leftIdx++];
            }else{
                megrgeArray[mergeIdx++] = right[rightIdx++];
            }
        }

        while (leftIdx <= len1) {
           megrgeArray[mergeIdx++]  = left[leftIdx++];
        }

        while (rightIdx <= len2) {
            megrgeArray[mergeIdx++] = right[rightIdx++];
        }
        return megrgeArray;
    }


    public static void main(String[] args) {
    int[] arr = {2,3,1,5,9,3,5};
    System.out.print(Arrays.toString(Divide(arr, 0, arr.length-1)) + " ");

    }
}
