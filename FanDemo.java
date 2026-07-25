class Fan {

    int speed;
    boolean isOn;

    Fan(int speed, boolean isOn) {
        this.speed = speed;
        this.isOn = isOn;
    }

    void display() {
        System.out.println("Speed : " + speed);
        System.out.println("Fan Status : " + (isOn ? "ON" : "OFF"));
        System.out.println();
    }
}

public class FanDemo {

    public static void main(String[] args) {

        Fan fan1 = new Fan(3, true);
        Fan fan2 = new Fan(0, false);

        fan1.display();
        fan2.display();

    }
}