package business;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import dao.model.BookingDTO;
import dao.model.CompletePlaceDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.BookingBO;
import model.CompletePlaceBO;
import model.CustomerBO;
import model.HotelBO;
import model.exception.ResourceNotFoundException;

public interface HotelinhoBusinessServices {
	public List<HotelDTO> getAllHotels();

	public HotelBO getHotelById(String id) throws ResourceNotFoundException;

	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException;

	public List<HotelDTO> filterHotelsByFacilities(HotelBO hotelBO);

	public void addNewCustomer(CustomerBO customerBO);

	public List<CompletePlaceBO> getPlacesForHotel(@PathVariable String id);
	
	public RoomDTO getSelectedRoom(String hotelId, String roomId) throws ResourceNotFoundException;

	public CustomerBO login(String username, String password) throws ResourceNotFoundException;
	
	public void createNewBooking(BookingBO bookingBO);
}
