import java.util.Arrays;

public class MedianOfTwoMergedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int mergeLength = nums1.length + nums2.length;
      int[] MergeArray = new int[mergeLength];
      int mp =0;
      int p1 =0;
      int p2 =0;
      while (nums1.length>p1 && nums2.length>p2) {
          if (nums1[p1] > nums2[p2]) {
              MergeArray[mp++] = nums2[p2++];
          }else{
              MergeArray[mp++] = nums1[p1++];
          }
      }
      while (nums1.length>p1) {
          MergeArray[mp++] = nums1[p1++];
      }
      while (nums2.length>p2) {
          MergeArray[mp++] = nums2[p2++];
      }

      Arrays.sort(MergeArray);

      int s = 0;
      int e = MergeArray.length-1;
      int middleIndex = s+(e-s)/2;
      double element = (MergeArray[middleIndex]);
  
      if(MergeArray.length % 2 == 0){
        return element = (MergeArray[middleIndex] + MergeArray[middleIndex +1]);
      }
      else
      return element;
}
    public static void main(String[] args) {
        int[] nums1 = {2,1};
        int[] nums2 = {3};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
