import java.util.Scanner;

public class GradeIdentifierWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0 - 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        } else {
            switch (marks / 10) {
                case 10: // 100
                case 9:  // 90 - 99
                    System.out.println("Grade: A");
                    break;
                case 8:  // 80 - 89
                    System.out.println("Grade: B");
                    break;
                case 7:  // 70 - 79
                    System.out.println("Grade: C");
                    break;
                case 6:  // 60 - 69
                    System.out.println("Grade: D");
                    break;
                case 5:  // 50 - 59
                    System.out.println("Grade: E");
                    break;
                default: // 0 - 49
                    System.out.println("Grade: F (Fail)");
            }
        }

        sc.close();
    }
}
