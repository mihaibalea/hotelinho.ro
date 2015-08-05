package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.BookingsDAO;
import dao.model.BookingDTO;

public class BookingsDAOImpl implements BookingsDAO {
	@Autowired
	private JdbcTemplate jdbc;

	public void createNewBooking(BookingDTO bookingDTO) {
		String sql = "insert into bookings values(?,?,?,?,?,?)";
		jdbc.update(sql, bookingDTO.getId(), bookingDTO.getCustomerId(), bookingDTO.getRoomId(),
				bookingDTO.getCheckin(), bookingDTO.getCheckout(), bookingDTO.getOtherSpecifications());

	}

}
