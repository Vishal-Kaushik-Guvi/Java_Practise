class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class ThisKeywordExample {
    public static void main(String[] args) {
    Student s1 = new Student("Alice", 20);
    s1.display();
    }
}
