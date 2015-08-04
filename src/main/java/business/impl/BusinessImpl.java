package business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.Business;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import manager.HotelinhoManager;
import model.HotelBO;
import utils.Translator;

public class BusinessImpl implements Business {
	@Autowired
	private HotelinhoManager hotelinhoManager;

	@Autowired
	private Translator translator;

	public List<HotelDTO> getAllCourses() {
		return hotelinhoManager.getAllHotels();
	}

	public HotelBO getHotelById(String id) {
		return translator.translateHotelDTOtoHotelBO(hotelinhoManager.getHotelById(id));

	}

	public List<RoomDTO> getRoomsForHotel(String id) {
		return hotelinhoManager.getRoomsForHotel(id);
	}

}
