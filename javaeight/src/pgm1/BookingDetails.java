package pgm1;

public class BookingDetails {

	private int userId;
	private String userName;
	private double bookingPrice;

	public BookingDetails() {
		super();
	}

	public BookingDetails(int userId, String userName, double bookingPrice) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.bookingPrice = bookingPrice;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBookingPrice() {
		return bookingPrice;
	}

	public void setBookingPrice(double bookingPrice) {
		this.bookingPrice = bookingPrice;
	}

}
