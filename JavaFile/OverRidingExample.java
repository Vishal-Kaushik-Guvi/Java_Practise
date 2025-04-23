class Machines{
    void computer(){
        System.out.println("Computer can Calculate");
    }
}

class quantam extends Machines{
    @Override
    void computer(){
        System.out.println("Quantam Computer calculates faster than normal computer");
    }
}
public class OverRidingExample {
    public static void main(String[] args) {
        Machines subClass = new quantam();
        Machines mainClass = new Machines();
        mainClass.computer();
        subClass.computer();
    }
}
