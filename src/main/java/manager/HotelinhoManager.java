package manager;

import java.util.List;

import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;

public interface HotelinhoManager {
	public List<HotelDTO> getAllHotels();
	public HotelDTO getHotelById(String id);
	public List<RoomDTO> getRoomsForHotel(String id);
	public void addNewCustomer(CustomerDTO customerDTO);

}
