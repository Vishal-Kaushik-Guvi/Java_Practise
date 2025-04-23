class Parents{
    void parentMethod(){
        System.out.println("Method represents Parent Class");
    }
}

class child extends Parents{
    void childMethod(){
        System.out.println("Method represents Child Class");
    }
}

class GrandChild extends child{
    void grandChild(){
        System.out.println("Method represents GrandChild Class");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.parentMethod();
        gc.childMethod();
        gc.grandChild();
    }
}
