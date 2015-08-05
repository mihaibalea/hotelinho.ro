package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.BookingsDAO;
import dao.model.BookingDTO;
import utils.BookingMapper;

public class BookingsDAOImpl implements BookingsDAO {
	@Autowired
	private JdbcTemplate jdbc;

	public void createNewBooking(BookingDTO bookingDTO) {
		String sql = "insert into bookings values(?,?,?,?,?,?)";
		jdbc.update(sql, bookingDTO.getId(), bookingDTO.getCustomerId(), bookingDTO.getRoomId(),
				bookingDTO.getCheckin(), bookingDTO.getCheckout(), bookingDTO.getOtherSpecifications());

	}

	public BookingDTO getBookingByCustomerId(String id) {
		String sql = "select * from bookings where customerId=? ";
		return jdbc.queryForObject(sql, new Object[] { id }, new BookingMapper());
	}
}
