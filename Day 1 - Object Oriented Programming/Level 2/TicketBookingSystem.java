import java.util.Scanner;

class MovieTicket{
	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;
	
	public MovieTicket(String movieName){
		this.movieName = movieName;
		this.seatNumber = "Not assigned";
		this.price = price;
		this.isBooked = false;
	}
	
	public void bookTicket(String seatNumber, double price){
		if(isBooked){
			System.out.print("\nTicket is already booked!");
		}
		else {
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked = true;
			System.out.print("\nTicket booked successfully!");
		}
	}
	
	public void displayTicket(){
		System.out.print("\nMovie Name : " + movieName);
		System.out.print("\nSeat Number : " + seatNumber);
		System.out.print("\nPrice: $" + price);
		System.out.print("\nBooking status : " + (isBooked ? "Booked" : "Available"));
	}
	
}

public class TicketBookingSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		MovieTicket ticket = new MovieTicket("Ironman");
		
		//Before booking ticket
		ticket.displayTicket();
		System.out.println();
		
		//Booking a ticket
		ticket.bookTicket("A15", 10);
		System.out.println();
		
		//After booking ticket
		ticket.displayTicket();
		System.out.println();
		
		//Trying to book ticket again even when ticket is already booked
		ticket.bookTicket("A13", 10);
		scanner.close();
	}
}