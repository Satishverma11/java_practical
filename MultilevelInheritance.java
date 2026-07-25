class Animal {

    void eat() {

        System.out.println("Animal Eats");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog Barks");

    }

}

class Puppy extends Dog {

    void weep() {

        System.out.println("Puppy Weeps");

    }

}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Puppy obj = new Puppy();

        obj.eat();

        obj.bark();

        obj.weep();

    }

}
