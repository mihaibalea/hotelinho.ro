package manager.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomersDAO;
import dao.HotelsDAO;
import dao.RoomsDAO;
import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;

public class HotelinhoManagerImpl implements HotelinhoManager {
	@Autowired
	private HotelsDAO hotelsDAO;
	@Autowired
	private CustomersDAO customersDAO;
	@Autowired
	private RoomsDAO roomsDAO;

	@Transactional
	public List<HotelDTO> getAllHotels() {
		return hotelsDAO.getAllHotels();
	}

	@Transactional
	public HotelDTO getHotelById(String id) {
		return hotelsDAO.getHotelById(id);
	}

	@Transactional
	public List<RoomDTO> getRoomsForHotel(String id) {
		return roomsDAO.getRoomsForHotel(id);
	}

	@Transactional
	public void addNewCustomer(CustomerDTO customerDTO) {
		UUID uuid = UUID.randomUUID();
		customerDTO.setId(uuid.toString());
		customersDAO.addNewCustomer(customerDTO);
	}

}
