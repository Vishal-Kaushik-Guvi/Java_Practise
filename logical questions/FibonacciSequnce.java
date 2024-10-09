import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequnce {

    static List<Integer> fib(int len, int first, int next, List<Integer> list){
        
        if(len == 0){
           return list;
        }
        int sum = first + next;

        list.add(sum);
       
        fib(len-1, next, sum, list);

        return list;

    }
// 0,1,1,2,3,5
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length of the Sequence ");
    int len = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int first = 0;
    int next = 1;

    list.add(first);
    list.add(next);

    List<Integer> result = FibonacciSequnce.fib(len, first, next ,list);
    System.out.println(result);
    sc.close();
    
 }
}
