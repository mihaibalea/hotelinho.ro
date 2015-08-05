package dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.HotelsDAO;
import dao.model.HotelDTO;
import manager.impl.HotelinhoManagerImpl;
import utils.HotelMapper;

public class HotelsDAOImpl implements HotelsDAO {
	@Autowired
	private JdbcTemplate jdbc;
	
	private static final Logger LOG=LoggerFactory.getLogger(HotelsDAOImpl.class);

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
		try {
			hotel = jdbc.queryForObject(sql, new Object[] { id }, new HotelMapper());
		} catch (EmptyResultDataAccessException e) {
			LOG.debug("method getHotelById() returned " + null);
			return null;
		}
		LOG.debug("method getHotelById() returned hotel with id " + id);
		return hotel;
	}

}
