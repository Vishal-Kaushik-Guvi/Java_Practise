public class SquareRoot {
  public static void main(String[] args) {
      int x = 49;
      int left = 1, right = x;

      // If x is less than 2, the square root of x is x itself.
      if (x < 2) {
          System.out.println(x);
          return;
      }
      
      while (left <= right) {
          int mid = left + (right - left) / 2;
          int square = mid * mid;
          
          System.out.println("Mid = " + mid);
          System.out.println("Square = " + square);
          
          if (square == x) {
              System.out.println("Found exact square root: " + mid);
              return;
          } else if (square < x) {
              left = mid + 1;
          } else {
              right = mid - 1;
          }
      }
      
      System.out.println("Approximate square root (integer part): " + right);
  }
}
