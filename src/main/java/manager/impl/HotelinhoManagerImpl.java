package manager.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import dao.CustomersDAO;
import dao.HotelsDAO;
import dao.PlacesDAO;
import dao.RoomsDAO;
import dao.model.CompletePlaceDTO;
import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;
import model.exception.ResourceNotFoundException;

public class HotelinhoManagerImpl implements HotelinhoManager {
	private static final Logger LOG=LoggerFactory.getLogger(HotelinhoManagerImpl.class);
	@Autowired
	private HotelsDAO hotelsDAO;
	@Autowired
	private CustomersDAO customersDAO;
	@Autowired
	private RoomsDAO roomsDAO;
	@Autowired
	private PlacesDAO placesDAO;

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
	public List<CompletePlaceDTO> getPlacesForHotel(@PathVariable String id){
		return placesDAO.getPlacesForHotel(id);
	}

	public CustomerDTO login(String username, String password) throws ResourceNotFoundException {
		CustomerDTO customerDTO=customersDAO.logIn(username, password);
		if(customerDTO==null){
			throw new ResourceNotFoundException("Invalid username or password");
		}
		return customerDTO;
		
	}
}
