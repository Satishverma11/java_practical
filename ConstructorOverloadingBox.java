
class Box {

    int length;
    int width;
    int height;

    Box() {
        length = width = height = 1;
    }

    Box(int side) {
        length = width = height = side;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}

public class ConstructorOverloadingBox {

    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);

        System.out.println("Volume of Box 1 = " + b1.volume());
        System.out.println("Volume of Box 2 = " + b2.volume());
        System.out.println("Volume of Box 3 = " + b3.volume());
    }
}
