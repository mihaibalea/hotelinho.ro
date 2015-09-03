package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import dao.model.RoomDTO;

public class RoomMapper implements RowMapper<RoomDTO> {
	public RoomDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		RoomDTO room = new RoomDTO();
		
		room.setId(rs.getString("id"));
		room.setHotelId(rs.getString("hotelId"));
		room.setRoomNumber(rs.getInt("roomNumber"));
		room.setType(rs.getString("type"));
		room.setNrBeds(rs.getInt("nrBeds"));
		room.setPrice(rs.getInt("price"));
		room.setTv(rs.getString("tv").equals("YES"));
		room.setMinibar(rs.getString("minibar").equals("YES"));
		room.setPhone(rs.getString("phone").equals("YES"));
		room.setAirConditioning(rs.getString("airConditioning").equals("YES"));
		room.setBalcony(rs.getString("balcony").equals("YES"));
		room.setPhoto(rs.getString("photo"));
		
		return room;
	}

}