public class ReverseNumber {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int temp = x % 10;
            rev = rev*10+temp;
            x /= 10;
        }
        if(rev > Integer.MAX_VALUE || rev == Integer.MAX_VALUE) return 0;
            return rev;
      } 
}
