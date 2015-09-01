package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.model.HotelDTO;

public class HotelMapper implements RowMapper<HotelDTO> {
	public HotelDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		HotelDTO hotel = new HotelDTO();
		hotel.setId(rs.getString("id"));
		hotel.setName(rs.getString("name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNrStars(rs.getInt("nrStars"));
		hotel.setAvailableRooms(rs.getInt("availableRooms"));
		hotel.setPool(rs.getString("pool").equals("YES"));
		hotel.setRestaurant((rs.getString("restaurant").equals("YES")));
		hotel.setPlayground((rs.getString("playground").equals("YES")));
		hotel.setParking((rs.getString("parking").equals("YES")));
		hotel.setWireless((rs.getString("wireless").equals("YES")));
		hotel.setRoomService((rs.getString("roomService").equals("YES")));
		hotel.setAirConditioning((rs.getString("airConditioning").equals("YES")));
		hotel.setLat(rs.getString("lat"));
		hotel.setLng(rs.getString("lng"));
		hotel.setPhoto(rs.getString("photo"));

		return hotel;
	}

}