import java.util.Scanner;

class HotelBooking{
	String guestName;
	String roomType;
	int nights;
	
	//default constructor
	HotelBooking(){
		this("Unknown", "Not Applicable", 0);
	}
	
	//Parameterized constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//copy constructor
	HotelBooking(HotelBooking previousBooking){
		this.guestName = previousBooking.guestName;
		this.roomType = previousBooking.roomType;
		this.nights = previousBooking.nights;
	}
	
	public void displayDetails(){
		System.out.println("Guest name : " + guestName);
		System.out.println("Room type : " + roomType);
		System.out.println("Number of nights stay : " + nights + "\n");
	}
}

public class HotelBookingSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter guest name : ");
		String name = scanner.nextLine();
		
		System.out.print("\nEnter room type : ");
		String roomType = scanner.nextLine();
		
		System.out.print("\nEnter number of nights : ");
		int nights = scanner.nextInt();
		System.out.println();
		
		HotelBooking booking1 = new HotelBooking();
		HotelBooking booking2 = new HotelBooking(name, roomType, nights);
		HotelBooking booking3 = new HotelBooking(booking2);
		
		booking1.displayDetails();
		booking2.displayDetails();
		booking3.displayDetails();
		scanner.close();
	}
}