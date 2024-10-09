import java.util.Scanner;

public class factorial {

public static int Factorial(int n){
    // if(n==1){
    //     return 1;
    // }
    if (n == 0) {
        return 1;
    }
    System.out.println("Values = " +n);
    return Factorial(n-1) * n;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();

    int result = factorial.Factorial(n);
    System.out.println(result);

    sc.close();
} 
}
