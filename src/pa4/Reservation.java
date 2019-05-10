package pa4;

import java.util.Date;

public class Reservation {

	public String seats;
	private String from;
	private String to;
	private String departureDate;
	private String returnDate;
	
	Reservation ( String seats, String from, String to, 
			String departureDate, String returnDate){
		
		this.from = from;
		this.to = to;
		this.seats = seats;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		
		
		
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Reservation [seats=" + seats + ", from=" + from + ", to=" + to + ", departureDate=" + departureDate
				+ ", returnDate=" + returnDate + "]";
	}
	
	
	
	
}
