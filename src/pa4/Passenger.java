package pa4;

public class Passenger {
	
	private String firstName;
    private String lastName;
	private Reservation reservation;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public  void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	@Override
	public String toString() {
		return "Passanger [firstName=" + firstName + ", lastName=" + lastName + ", reservation=" + reservation + "]";
	}
	
	

}
