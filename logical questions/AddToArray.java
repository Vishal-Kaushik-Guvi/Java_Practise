import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray {
        public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> total = new ArrayList<>();
        int carry = 0;
        int p = num.length-1;
        while (p>=0 || k>0) {
            int val = 0;

            if (p>=0) {
               val =  num[p];
            }
        
        int last = k % 10;

        int sum = val + last + carry;

        int remain = sum%10;

        carry = sum /10;

        total.add(remain);

        k = k/10;

        p--;
        }
        Collections.reverse(total);
        return total;
    }

    public static void main(String[] args) {
        int[] num = {2,7,4};
        int k = 181;

        System.out.println(addToArrayForm(num, k));
    }
}
