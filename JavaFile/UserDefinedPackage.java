import UserDefinedPackageExample.Calculator;

public class UserDefinedPackage {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int product = calc.multiply(4, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
