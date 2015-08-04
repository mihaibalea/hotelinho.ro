package dao;

import java.util.List;

import dao.model.HotelDTO;
import dao.model.RoomDTO;

public interface HotelsDAO {
	public List<HotelDTO> getAllHotels();
	public HotelDTO getHotelById(String id);
	public List<RoomDTO> getRoomsForHotel(String id);

}
