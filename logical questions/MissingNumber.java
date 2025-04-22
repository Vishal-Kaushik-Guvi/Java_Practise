public class MissingNumber {

    public static int missingNumber(int[] nums) {
        // formula of findig missing number expectedSum - actuakSum acc to math
        // 0+1+2+3+4....N = n*(n+1)/2
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5};
        // expected sum = 0+1+2+3+4+5 = 15
        // current sum == 0+1+2+4+5 = 12
        // achutal sum = 15-12 = 3
        System.out.println(missingNumber(nums));
    }
}
