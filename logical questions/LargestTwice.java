public class LargestTwice {
    public static int dominantIndex(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
             max = Math.max(max, nums[i]);
             if (max == nums[i]) {
                continue;
             }else if(max>=nums[i]*2){
                return max;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
}
