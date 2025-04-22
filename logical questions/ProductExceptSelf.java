import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod1 = 1;
        int prod2 = 1;
        int[] arr = new int[n];
        int zeros = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                prod1 *= nums[i];
            }
            if(nums[i] == 0){
                zeros++;
            }
            prod2 *= nums[i];
        }

        if(zeros > 1){
            return arr;
        }

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                arr[i] = prod2/nums[i];
            }else{
                arr[i] = prod1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
} 
