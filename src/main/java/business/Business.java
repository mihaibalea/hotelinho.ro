package business;

import java.util.List;

import dao.model.HotelDTO;
import dao.model.RoomDTO;

public interface Business {
	public List<HotelDTO> getAllCourses();
	public HotelDTO getHotelById(String id);
	public List<RoomDTO> getRoomsForHotel(String id);

}
