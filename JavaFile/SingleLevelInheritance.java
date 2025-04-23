class ParentClass{
    void parent(){
        System.out.println("Method Of Parent class");
    }
}

class ChildClass extends ParentClass{
    void child(){
        System.out.println("Method of Child Class");
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        pc.parent();
        ChildClass cl = new ChildClass();
        cl.child();
        cl.parent();;
    }
}
