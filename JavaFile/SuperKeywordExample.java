class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    void printType() {      
        System.out.println("Type from child class: " + type);
        System.out.println("Type from parent class: " + super.type);
    }

    void displayInfo() {
        super.display();
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.printType();
    dog.displayInfo();
  }
}

