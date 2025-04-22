import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage > 75) {
            System.out.println("You passed with Distinction.");
        } else if (percentage >= 60) {
            System.out.println("You passed with First Division.");
        } else if (percentage >= 50) {
            System.out.println("You passed with Second Division.");
        } else if (percentage >= 40) {
            System.out.println("You passed with Third Division.");
        } else {
            System.out.println("You have Failed.");
        }

        sc.close();
    } 
}
