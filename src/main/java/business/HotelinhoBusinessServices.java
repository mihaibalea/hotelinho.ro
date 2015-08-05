package business;

import java.util.List;

import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.CustomerBO;
import model.HotelBO;
import model.exception.ResourceNotFoundException;

public interface HotelinhoBusinessServices {
	public List<HotelDTO> getAllCourses();

	public HotelBO getHotelById(String id) throws ResourceNotFoundException;

	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException;

	public List<HotelDTO> filterHotelsByFacilities();

	public void addNewCustomer(CustomerBO customerBO);

}
