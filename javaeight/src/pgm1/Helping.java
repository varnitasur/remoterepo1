package pgm1;

import java.util.List;
import java.util.stream.Collectors;

public interface Helping {

	/**
	 * @param bookings
	 * @return bookings having price more than 50000
	 */
	default List<BookingDetails> getBookings(List<BookingDetails> bookings) {

		List<BookingDetails> filteredBooks = bookings.stream().filter(booking -> booking.getBookingPrice() > 50000)
				.collect(Collectors.toList());

		return filteredBooks;
	}

	/**
	 * @param bookings
	 * @return sum of all the bookings
	 */
	static double getTotalBookingPrice(List<BookingDetails> bookings) {

		List<Double> bookingPrices = bookings.stream().map(booking->booking.getBookingPrice()).collect(Collectors.toList());
		
		return bookingPrices.stream().reduce(0.0,(booking1,booking2)->(booking1+booking2));
	}
}
