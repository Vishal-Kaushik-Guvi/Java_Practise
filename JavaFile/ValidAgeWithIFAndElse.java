import java.util.Scanner;

public class ValidAgeWithIFAndElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        if (age>=18) {
            System.out.println("You are eligible for driving");
        }else{
            System.out.println("Your are not eligible for driving");
        }
        sc.close();
    }
}
