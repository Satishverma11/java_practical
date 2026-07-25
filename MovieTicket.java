public class MovieTicket {

    int seatPrice = 250;
    int availableSeats = 100;

    void display() {

        System.out.println("Seat Price = " + seatPrice);
        System.out.println("Available Seats = " + availableSeats);

    }

    public static void main(String[] args) {

        MovieTicket obj = new MovieTicket();

        obj.display();

    }
}
