public class FindPivotIndex {

    public static int pivotIndex(int[] nums){
            int totalSum = 0;
            int leftSum = 0;
            
            // Calculate total sum of the array
            for (int num : nums) {
                totalSum += num;
            }
            
            // Iterate through the array to find the pivot index
            for (int i = 0; i < nums.length; i++) {
                // If the left sum equals the right sum
                if (leftSum == totalSum - leftSum - nums[i]) {
                    return i;
                }
                // Update left sum for the next iteration
                leftSum += nums[i];
            }
            
            // Return -1 if no pivot index is found
            return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int result = FindPivotIndex.pivotIndex(nums);
        System.out.println(result);
    }
}
