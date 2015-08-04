package manager.impl;

import java.util.List;

import dao.HotelsDAO;
import dao.model.HotelDTO;
import manager.HotelinhoManager;

public class HotelinhoManagerImpl implements HotelinhoManager {
	private HotelsDAO hotelsDAO;
	
	public HotelinhoManagerImpl(HotelsDAO hotelsDAO){
		this.hotelsDAO=hotelsDAO;
	}
	
	public List<HotelDTO> getAllHotels() {
		return hotelsDAO.getAllHotels();
	}
	
	

}
