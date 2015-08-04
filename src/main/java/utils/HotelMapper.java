package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.model.HotelDTO;

public class HotelMapper implements RowMapper<HotelDTO> {
	public HotelDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		HotelDTO course = new HotelDTO();
		course.setId(rs.getString("id"));
		course.setName(rs.getString("name"));
		course.setAddress(rs.getString("address"));
		course.setNrStars(rs.getInt("nrStars"));
		course.setAvailableRooms(rs.getInt("availableRooms"));
		course.setPool(rs.getString("pool").equals("YES"));
		course.setRestaurant((rs.getString("restaurant").equals("YES")));
		course.setPlayground((rs.getString("playground").equals("YES")));
		course.setParking((rs.getString("parking").equals("YES")));
		course.setWireless((rs.getString("wireless").equals("YES")));
		course.setRoomService((rs.getString("roomService").equals("YES")));
		course.setAirConditioning((rs.getString("airConditioning").equals("YES")));

		return course;
	}

}