import java.util.ArrayList;
import java.util.Arrays;

public class test {
  static ArrayList<Integer> subarraySum(int[] arr, int target) {
    ArrayList<Integer> store = new ArrayList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      int total = 0;
      for (int j = i + 1; j < arr.length; j++) {
        total = arr[i] + arr[j];
        if (total == target) {
          store.add(i);
          store.add(j);
          return store;
        }
      }
    }
    return store;
  }

  public static int[] firstandlast(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = -1;
    result[1] = -1;

    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      if (nums[start] == target) {
        result[0] = start;
      } else if (nums[end] == target) {
        result[1] = end;
      }
      start++;
      end--;
    }
    return result;
  }

  public void febonacci(int n) {
    int a = 0;
    int b = 1;
    int c = 1;

    System.out.print(a + "," + b + "," + c);

    for (int i = 3; i <= n; i++) {
      int d = a + b + c;
      System.out.print("," + d);
      a = b;
      b = c;
      c = d;

    }
  }

  public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,10};
    int target = 8;

    System.out.println(Arrays.toString(firstandlast(nums, target)));

  }
}