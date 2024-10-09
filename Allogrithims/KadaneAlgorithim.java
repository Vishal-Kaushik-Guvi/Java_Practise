// Its an array alogorithim used in Maximum sum of sub arrays in an Array.
public class KadaneAlgorithim {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            System.out.println("For value " +arr[i]);

            System.out.print("Sum in the Start " +sum+ " + " +arr[i]  +" = ");

            sum += arr[i];

            System.out.println(sum);

            max = Math.max(max, sum);
            
            System.out.println("Maximum " +max);

            if (sum < 0) {
                sum = 0;
            }

            System.out.println("Sum in the End " +sum);

            System.out.println("-------------------------------------------------");
        }
        System.out.println(max);
    }
}
