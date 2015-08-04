package business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.Business;
import dao.model.HotelDTO;
import manager.HotelinhoManager;

public class BusinessImpl implements Business {
	@Autowired
	private HotelinhoManager hotelinhoManager;

	public List<HotelDTO> getAllCourses() {
		return hotelinhoManager.getAllHotels();
	}

}
