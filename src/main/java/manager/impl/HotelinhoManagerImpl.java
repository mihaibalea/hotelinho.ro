package manager.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import dao.BookingsDAO;
import dao.CustomersDAO;
import dao.HotelsDAO;
import dao.PlacesDAO;
import dao.RoomsDAO;
import dao.model.BookingDTO;
import dao.model.CompletePlaceDTO;
import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;
import model.BookingBO;
import model.HotelBO;
import model.exception.ResourceNotFoundException;

public class HotelinhoManagerImpl implements HotelinhoManager {
	private static final Logger LOG = LoggerFactory.getLogger(HotelinhoManagerImpl.class);
	@Autowired
	private HotelsDAO hotelsDAO;
	@Autowired
	private CustomersDAO customersDAO;
	@Autowired
	private RoomsDAO roomsDAO;
	@Autowired
	private PlacesDAO placesDAO;
	@Autowired
	private BookingsDAO bookingsDAO;

	@Transactional
	public List<HotelDTO> getAllHotels() {
		return hotelsDAO.getAllHotels();
	}

	@Transactional
	public HotelDTO getHotelById(String id) throws ResourceNotFoundException {
		HotelDTO hotel = hotelsDAO.getHotelById(id);
		if (hotel == null) {
			LOG.debug("method getHotelById() returned " + null);
			throw new ResourceNotFoundException("The hotel with id: " + id + " does not exist");
		}
		LOG.debug("method getHotelById() returned hotel with id " + id);
		return hotel;
	}

	@Transactional
	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException {
		HotelDTO hotel = hotelsDAO.getHotelById(id);
		if (hotel == null) {
			LOG.debug("method getRoomsForHotel() returned " + null);
			throw new ResourceNotFoundException("The hotel with id: " + id + " does not exist");
		}
		return roomsDAO.getRoomsForHotel(id);
	}

	@Transactional
	public void addNewCustomer(CustomerDTO customerDTO) {
		UUID uuid = UUID.randomUUID();
		customerDTO.setId(uuid.toString());
		customersDAO.addNewCustomer(customerDTO);
	}

	@Transactional
	public List<CompletePlaceDTO> getPlacesForHotel(@PathVariable String id) {
		return placesDAO.getPlacesForHotel(id);
	}

	@Transactional
	public RoomDTO getSelectedRoom(String hotelId, String roomId) throws ResourceNotFoundException {
		List<RoomDTO> listOfRooms = roomsDAO.getRoomsForHotel(hotelId);
		for (RoomDTO roomDTO : listOfRooms) {
			if (roomDTO.getId().equals(roomId)) {
				LOG.debug(roomDTO.getId());
				return roomDTO;
			}
		}
		throw new ResourceNotFoundException("The room with id " + roomId + " does not eist");

	}

	@Transactional
	public CustomerDTO login(String username, String password) throws ResourceNotFoundException {
		CustomerDTO customerDTO = customersDAO.logIn(username, password);
		if (customerDTO == null) {
			throw new ResourceNotFoundException("Invalid username or password");
		}
		return customerDTO;

	}
	
	
	@Transactional
	public void createNewBooking(BookingDTO bookingDTO){
		UUID uuid=UUID.randomUUID();
		bookingDTO.setId(uuid.toString());
		bookingsDAO.createNewBooking(bookingDTO);
		
	}
	@Transactional
	public List<HotelDTO> filterHotelsByFacilities(HotelBO hotelBO) {
		String sql="";
		if (hotelBO.isPool()==true)
			sql+="pool='YES' and ";
			
		
		if(hotelBO.isRestaurant()==true)
			sql+="restaurant='YES' and ";
		if(hotelBO.isPlayground()==true)
			sql+="playground='YES' and ";
		if(hotelBO.isParking()==true)
			sql+="parking='YES' and ";
		if(hotelBO.isWireless()==true)
			sql+="wireless='YES' and ";
		if(hotelBO.isRoomService()==true)
			sql+="roomService='YES' and ";
		if(hotelBO.isAirConditioning()==true)
			sql+="airConditioning='YES' and ";
		sql+="1;";
		
		return hotelsDAO.filterHotelsByFacilities(sql);
	}
}
