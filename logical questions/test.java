
public class test {
  public int maxArea(int[] height) {
    int maxArea = 0;
   for(int i=0; i<height.length-1; i++){
          
       for(int j=i+1; j<height.length; j++){
        int count = 1;
           System.out.print(+height[i] +" * "+ count +" = ");
           int area = height[i] * count;
           System.out.println(area);
           maxArea = Math.max(maxArea,area);
           count++;
       }
   }
   return maxArea;
}

  public static void main(String[] args) {
  int[] arr = {1,8,6,2,5,4,8,3,7};
  test t = new test();
  int result = t.maxArea(arr);
  System.out.println("Answer is " + result);
  }
}