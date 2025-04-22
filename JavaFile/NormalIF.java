import java.util.Scanner;

public class NormalIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check = "Hello World";
        System.out.println("Type the String : " +check);
        String type = sc.nextLine();
        if (type.equals(check)) {
            System.out.println("Correct");
        }
        sc.close();
    }
}
