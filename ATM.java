public class ATM {

    int pin = 1234;
    double balance = 10000;

    void checkBalance(int enteredPin) {

        if (enteredPin == pin) {
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Invalid PIN");
        }

    }

    public static void main(String[] args) {

        ATM obj = new ATM();

        obj.checkBalance(1234);

    }
}