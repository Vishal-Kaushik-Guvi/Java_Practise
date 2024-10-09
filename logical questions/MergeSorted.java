import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSorted{
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = nums1.length;
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<m; i++){
          if(nums1[i] != 0){
            list.add(nums1[i]);
          }else{
            --m;
          }
        }

        for(int i=0; i<n; i++){
          if(nums2[i] != 0){
           list.add(nums2[i]);
          }else{
            --n;
          }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}