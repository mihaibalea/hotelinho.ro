package dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import dao.HotelsDAO;
import dao.model.HotelDTO;
import utils.HotelMapper;

public class HotelsDAOImpl implements HotelsDAO {
	private JdbcTemplate jdbc;

	public HotelsDAOImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public List<HotelDTO> getAllHotels() {
		String sql = "select * from hotels";
		return jdbc.query(sql, new HotelMapper());
	}

	public HotelDTO getHotelById(String id) {
		String sql = "select * from hotels where id=?";
		HotelDTO hotel;
		hotel =jdbc.queryForObject(sql, new Object[] { id }, new HotelMapper());
		return hotel;
	}

}
