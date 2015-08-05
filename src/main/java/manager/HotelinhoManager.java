package manager;

import java.util.List;

import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.exception.ResourceNotFoundException;

public interface HotelinhoManager {
	public List<HotelDTO> getAllHotels();
	public HotelDTO getHotelById(String id) throws ResourceNotFoundException;
	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException;
	public void addNewCustomer(CustomerDTO customerDTO);

}
