interface Calculate {

    void square(int n);

    void cube(int n);

}

class Number implements Calculate {

    public void square(int n) {

        System.out.println("Square = " + (n * n));

    }

    public void cube(int n) {

        System.out.println("Cube = " + (n * n * n));

    }

}

public class InterfaceImplementation {

    public static void main(String[] args) {

        Number obj = new Number();

        obj.square(5);

        obj.cube(5);

    }

}