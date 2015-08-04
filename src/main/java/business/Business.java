package business;

import java.util.List;

import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.CustomerBO;
import model.HotelBO;

public interface Business {
	public List<HotelDTO> getAllCourses();

	public HotelBO getHotelById(String id);

	public List<RoomDTO> getRoomsForHotel(String id);

	public List<HotelDTO> filterHotelsByFacilities();

	public void addNewCustomer(CustomerBO customerBO);

}
