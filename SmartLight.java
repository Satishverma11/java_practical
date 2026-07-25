public class SmartLight {

    int brightness = 75;

    void display() {

        System.out.println("Brightness Level = " + brightness + "%");

    }

    public static void main(String[] args) {

        SmartLight obj = new SmartLight();

        obj.display();

    }
}
