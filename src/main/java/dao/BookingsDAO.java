package dao;

import dao.model.BookingDTO;

public interface BookingsDAO {

	public void createNewBooking(BookingDTO bookingDTO);

	public BookingDTO getBookingByCustomerId(String id);
}
