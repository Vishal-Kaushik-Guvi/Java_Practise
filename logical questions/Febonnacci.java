public class Febonnacci {

   // return the number at the position given
    static int febona(int position){
      if(position == 0){
         return 0;
       }
      if(position == 1){
         return 1;
      }
      System.out.println("lenght " +position);
     int ans = febona(position-1) + febona(position-2);
     return ans;
    }

    public static void main(String[] args) {
       int position = 3; // 0, 1, 1, 2, 3 ( so 2 is at 3rd so 2 is the ans. )
       int result = Febonnacci.febona(position);
       System.out.println("result " +result);
    }
}
