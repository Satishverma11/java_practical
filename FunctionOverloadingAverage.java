public class FunctionOverloadingAverage {

    double average(int a, int b) {
        return (a + b) / 2.0;
    }

    double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        FunctionOverloadingAverage obj = new FunctionOverloadingAverage();

        System.out.println("Average of Two Numbers = " + obj.average(10, 20));
        System.out.println("Average of Three Numbers = " + obj.average(10, 20, 30));
    }
}