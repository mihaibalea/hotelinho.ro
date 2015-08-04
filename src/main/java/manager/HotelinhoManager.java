package manager;

import java.util.List;

import dao.model.HotelDTO;

public interface HotelinhoManager {
	public List<HotelDTO> getAllHotels();
	public HotelDTO getHotelById(String id);

}
