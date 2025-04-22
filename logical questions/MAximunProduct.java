public class MAximunProduct {

    public static int maximumProduct(int[] arr){
        int maxProduct = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int product = (arr[i]-1)*(arr[j]-1);
                 maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maximumProduct(arr));
    }
}
