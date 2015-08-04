package manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.HotelsDAO;
import dao.model.HotelDTO;
import manager.HotelinhoManager;

public class HotelinhoManagerImpl implements HotelinhoManager {
	@Autowired
	private HotelsDAO hotelsDAO;

	@Transactional
	public List<HotelDTO> getAllHotels() {
		return hotelsDAO.getAllHotels();
	}

	@Transactional
	public HotelDTO getHotelById(String id) {
		return hotelsDAO.getHotelById(id);
	}

}
