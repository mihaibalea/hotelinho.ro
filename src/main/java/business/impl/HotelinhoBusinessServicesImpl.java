package business.impl;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import business.HotelinhoBusinessServices;
import dao.model.CompletePlaceDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;
import model.BookingBO;
import model.CompletePlaceBO;
import model.CustomerBO;
import model.HotelBO;
import model.exception.ResourceNotFoundException;
import utils.Translator;

public class HotelinhoBusinessServicesImpl implements HotelinhoBusinessServices {
	private static final Logger LOG = LoggerFactory.getLogger(HotelinhoBusinessServicesImpl.class);
	@Autowired
	private HotelinhoManager hotelinhoManager;

	@Autowired
	private Translator translator;

	public List<HotelDTO> getAllHotels() {
		return hotelinhoManager.getAllHotels();
	}

	public HotelBO getHotelById(String id) throws ResourceNotFoundException {
		HotelBO hotel = translator.translateHotelDTOtoHotelBO(hotelinhoManager.getHotelById(id));
		LOG.debug("method getHotelById() returned " + hotel);
		return hotel;

	}

	public List<RoomDTO> getRoomsForHotel(String id) throws ResourceNotFoundException {
		List<RoomDTO> list = hotelinhoManager.getRoomsForHotel(id);
		LOG.debug("method getRoomsForHotel() returned " + list);
		return list;
	}

	public List<HotelDTO> filterHotelsByFacilities() {

		return new LinkedList<HotelDTO>();

	}

	public void addNewCustomer(CustomerBO customerBO) {
		hotelinhoManager.addNewCustomer(translator.translateCustomerBOtoCustomerDTO(customerBO));
	}

	public List<CompletePlaceBO> getPlacesForHotel(@PathVariable String id){
		return translator.translateListOfCompletePlacesDTOtoListOfCompletePlacesBO(hotelinhoManager.getPlacesForHotel(id));
	}

	public CustomerBO login(String username, String password) throws ResourceNotFoundException {
		return translator.translateCustomerDTOtoCustomerBO(hotelinhoManager.login(username,password));
	
	}
	
	public RoomDTO getSelectedRoom(String hotelId, String roomId) throws ResourceNotFoundException{
		return hotelinhoManager.getSelectedRoom(hotelId, roomId);
		
	}

	public void createNewBooking(BookingBO bookingBO) {
		hotelinhoManager.createNewBooking(translator.translateBookingBOToBookingDTO(bookingBO));
		
	}
}
