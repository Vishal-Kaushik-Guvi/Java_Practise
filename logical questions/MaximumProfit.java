public class MaximumProfit {
public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    if (prices == null || prices.length == 0) {
        System.out.println(0);
    }

    int maxPrice = Integer.MAX_VALUE;
    int maxProfit = 0;


    for (int price : prices) {
        if (price < maxPrice) {
            maxPrice = price;
        } else if (price - maxPrice > maxProfit) {
            maxProfit = price - maxPrice;
        }
    }
    System.out.println(maxProfit);
}
}
