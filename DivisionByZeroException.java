public class DivisionByZeroException {

    public static void main(String[] args) {

        int a = 20;

        int b = 0;

        try {

            int result = a / b;

            System.out.println(result);

        }

        catch (ArithmeticException e) {

            System.out.println("Division by Zero is not Allowed.");

        }

        finally {

            System.out.println("Program Executed Successfully.");

        }

    }

}