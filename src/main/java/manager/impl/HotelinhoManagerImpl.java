package manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.HotelsDAO;
import dao.model.HotelDTO;
import manager.HotelinhoManager;

public class HotelinhoManagerImpl implements HotelinhoManager {
	@Autowired
	private HotelsDAO hotelsDAO;
	
	public List<HotelDTO> getAllHotels() {
		return hotelsDAO.getAllHotels();
	}
	
	

}
