package java_oops;

public class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private int costPerTicket = 100;
    
    MovieTicket(int movieId, int noOfSeats){
        this.movieId=movieId;
        this.noOfSeats=noOfSeats;
    }
    double calculateTotalAmount(){
        double amount = Math.round((costPerTicket*noOfSeats)*(1.02));
        return amount;
    }
}
class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
