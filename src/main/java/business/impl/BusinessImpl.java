package business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.Business;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;

public class BusinessImpl implements Business {
	@Autowired
	private HotelinhoManager hotelinhoManager;

	public List<HotelDTO> getAllCourses() {
		return hotelinhoManager.getAllHotels();
	}

	public HotelDTO getHotelById(String id) {
		return hotelinhoManager.getHotelById(id);
	}

	public List<RoomDTO> getRoomsForHotel(String id) {
		return hotelinhoManager.getRoomsForHotel(id);
	}

}
