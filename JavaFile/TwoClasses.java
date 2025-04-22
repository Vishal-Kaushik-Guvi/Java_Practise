class  vehicle {
  String name;
  int cost;

  public void displayVehicle(String name, int cost){
    System.out.println("Name of Vehicle " +name);
    System.out.println("Cost of Vehicle " +cost);
  }
}

public class  TwoClasses{
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.name = "Maruti";
        v.cost = 100000;
        v.displayVehicle(v.name, v.cost);
    }
}
