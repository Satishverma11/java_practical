public class Car {

    int speed = 80;
    int fuel = 40;

    void display() {

        System.out.println("Speed = " + speed + " km/h");
        System.out.println("Fuel Level = " + fuel + " Litres");

    }

    public static void main(String[] args) {

        Car obj = new Car();

        obj.display();

    }
}
