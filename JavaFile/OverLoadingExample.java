public class OverLoadingExample {

       // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }
    
        // Method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Method to add two doubles
        public double add(double a, double b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            OverLoadingExample calc = new OverLoadingExample();
    
            System.out.println("Sum of 5 and 10: " + calc.add(5, 10));                 // Calls int add(int, int)
            System.out.println("Sum of 5, 10 and 15: " + calc.add(5, 10, 15));         // Calls int add(int, int, int)
            System.out.println("Sum of 5.5 and 6.3: " + calc.add(5.5, 6.3));           // Calls double add(double, double)
        }
    }
