public class IncreasingTrippleSquence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int val  = nums[i];
            if (first < val) {
                first = val;
            }else if (second < nums[i]) {
                second = val;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,-2,-3};
        System.out.println(increasingTriplet(arr));

    }
}
