package business;

import java.util.List;

import dao.model.HotelDTO;

public interface Business {
	public List<HotelDTO> getAllCourses();
	public HotelDTO getHotelById(String id);

}
