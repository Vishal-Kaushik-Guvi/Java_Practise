import java.util.Arrays;

public class FirstAndLastSearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    
    // Helper function to find the first occurrence of the target
    private static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    
    // Helper function to find the last occurrence of the target
    private static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        FirstAndLastSearchRange fl = new FirstAndLastSearchRange();
        int[] nums = {1,2,3,4,4,5};
        int target = 4;
        int[] result = fl.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
