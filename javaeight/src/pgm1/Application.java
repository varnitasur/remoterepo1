package pgm1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application implements Helping {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();

		User user1 = new User(1, "Raj", 60000, 30);
		User user2 = new User(2, "Subham", 44000, 22);
		User user3 = new User(3, "Srajit", 51000, 65);
		User user4 = new User(4, "Komala", 49000, 22);

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Users Details : ");
		users.stream().forEach(user -> {

			System.out.println(
					user.getUserId() + "  " + user.getUserName() + "  " + user.getUserAge() + "  " + user.getSalary());
		});

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Bookings Details : ");
		List<BookingDetails> bookings = users.stream().map(user -> mapper(user)).collect(Collectors.toList());

		bookings.stream().forEach(booking -> {

			System.out.println(booking.getUserId() + "  " + booking.getUserName() + "  " + booking.getBookingPrice());
		});

		Application app = new Application();

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Bookings having price > 50000 : ");

		List<BookingDetails> filteredBooks = app.getBookings(bookings);

		filteredBooks.stream().forEach(booking -> {

			System.out.println(booking.getUserId() + "  " + booking.getUserName() + "  " + booking.getBookingPrice());
		});

		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Total Price of Bookings: ");
		Double sum = Helping.getTotalBookingPrice(bookings);
		System.out.println(sum);
	}

	private static BookingDetails mapper(User user) {

		BookingDetails booking = new BookingDetails();
		booking.setUserId(user.getUserId());
		booking.setUserName(user.getUserName());
		booking.setBookingPrice(user.getSalary());

		if (user.getUserAge() > 60)
			booking.setBookingPrice(booking.getBookingPrice() * 0.1 * 0.8);

		return booking;
	}
}
