package dao;

import java.util.List;

import dao.model.HotelDTO;

public interface HotelsDAO {
	public List<HotelDTO> getAllHotels();

	public HotelDTO getHotelById(String id);

	public List<HotelDTO> filterHotelsByFacilities(String sql);
}
