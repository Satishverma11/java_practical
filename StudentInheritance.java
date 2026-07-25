class Student {

    String name = "Satish";
    int rollNo = 101;
}

class Result extends Student {

    int marks = 90;

    void display() {

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Marks        : " + marks);
    }
}

public class StudentInheritance {

    public static void main(String[] args) {

        Result obj = new Result();

        obj.display();
    }
}