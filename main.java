import javax.swing.text.View;

public class main {
    public static void main (String[] args){
        String brand = "Audi";
        int speed = 10000;
        int fuel = 10;
        int amount = 100;
        Vehicle vehicle3 = new Vehicle();
        vehicle3.displayInfo();
        vehicle3.refuel(amount);
        vehicle3.displayInfo();
    }
}
