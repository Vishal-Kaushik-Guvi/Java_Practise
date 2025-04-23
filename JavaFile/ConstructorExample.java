public class ConstructorExample {
    ConstructorExample(String print){
        System.out.println(print);
        System.out.println("Its Written inside the constructor");
    }
    public static void main(String[] args) {
        new ConstructorExample("This is a constructor with address");
    }
}
