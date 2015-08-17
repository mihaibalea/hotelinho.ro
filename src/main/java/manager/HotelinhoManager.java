package manager;

import java.util.List;

import dao.model.BookingDTO;
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
	public List<CompletePlaceDTO> getPlacesForHotel(String id);
	public RoomDTO getSelectedRoom(String hotelId, String roomId) throws ResourceNotFoundException;
	public CustomerDTO login(String username, String password) throws ResourceNotFoundException;
	public void createNewBooking(BookingDTO bookingDTO);

}
