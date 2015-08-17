package manager;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import dao.model.CompletePlaceDTO;
import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.exception.ResourceNotFoundException;

public interface HotelinhoManager {
	public List<HotelDTO> getAllHotels();
	public HotelDTO getHotelById(String id) throws ResourceNotFoundException;
	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException;
	public void addNewCustomer(CustomerDTO customerDTO);
	public List<CompletePlaceDTO> getPlacesForHotel(@PathVariable String id);
	public CustomerDTO login(String username, String password) throws ResourceNotFoundException;

}
