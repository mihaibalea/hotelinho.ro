package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.model.BookingDTO;

public class BookingMapper implements RowMapper<BookingDTO> {
	public BookingDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookingDTO bookingDTO = new BookingDTO();
		bookingDTO.setId(rs.getString("id"));
		bookingDTO.setCustomerId(rs.getString("customerId"));
		bookingDTO.setRoomId(rs.getString("roomId"));
		bookingDTO.setCheckin(rs.getDate("checkIn"));
		bookingDTO.setCheckout(rs.getDate("checkOut"));
		bookingDTO.setOtherSpecifications(rs.getString("otherSpecifications"));
		return bookingDTO;
	}

}
