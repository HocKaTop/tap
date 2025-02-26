public class Vehicle {
    String brand;
    int speed;
    int fuel;
    //Конструктор по умолчанию
    Vehicle(){
        super();
    }
    //Конструктор с двумя параметрами
    Vehicle(String brand,int speed){
    this.brand = brand;
    this.speed = speed;
    }
    //Конструктор с 3-мя параметрами
    Vehicle(String brand, int speed, int fuel){
        this (brand,speed);
        this.fuel = fuel;
    }
    void displayInfo(){
        System.out.println("\n");
        System.out.println("Марка: "+ brand+ "\n"+"Максимальная скорость:"+ speed+" км/ч\n"+ "Количество топлива:"+ fuel + "л");
    }
    void refuel (int amount){
        this.fuel= fuel+amount;
    }
}
