package dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import dao.HotelsDAO;
import dao.model.HotelDTO;

public class HotelsDAOImpl implements HotelsDAO {
	private JdbcTemplate jdbc;
	
	public HotelsDAOImpl(JdbcTemplate jdbc) {
	this.jdbc=jdbc;
	}

	public List<HotelDTO> getAllHotels() {
		List<HotelDTO> listOfHotels = new LinkedList<HotelDTO>();
		HotelDTO hotel = new HotelDTO();
		listOfHotels.add(hotel);
		return listOfHotels;
	}

}
