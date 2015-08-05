package dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.RoomsDAO;
import dao.model.RoomDTO;
import utils.RoomMapper;

public class RoomsDAOImpl implements RoomsDAO{
	@Autowired
	private JdbcTemplate jdbc;

	public List<RoomDTO> getRoomsForHotel(String id) {
		String sql = "select * from rooms where hotelId=?";
		List<RoomDTO> rooms;
		rooms = jdbc.query(sql, new Object[] { id }, new RoomMapper());
		return rooms;
	}

}
