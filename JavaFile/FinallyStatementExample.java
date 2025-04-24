public class FinallyStatementExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}
