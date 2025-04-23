public class ConstructorOverLoadingExample {
        String name;
        int age;
    
        // Constructor with no parameters
        public ConstructorOverLoadingExample() {
            name = "Unknown";
            age = 0;
        }
    
        // Constructor with one parameter
        public ConstructorOverLoadingExample(String n) {
            name = n;
            age = 18; 
        }
    
        // Constructor with two parameters
        public ConstructorOverLoadingExample(String n, int a) {
            name = n;
            age = a;
        }
    
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    
        public static void main(String[] args) {
            ConstructorOverLoadingExample s1 = new ConstructorOverLoadingExample();
            ConstructorOverLoadingExample s2 = new ConstructorOverLoadingExample("Amit");
            ConstructorOverLoadingExample s3 = new ConstructorOverLoadingExample("Pooja", 21);
    
            s1.display(); 
            s2.display();  
            s3.display(); 
        }
    }
