package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import business.Business;
import dao.model.HotelDTO;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	@Autowired
	private Business business;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDTO> getAllHotels() {
		return business.getAllCourses();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HotelDTO getHotelById(@PathVariable String id) {
		return business.getHotelById(id);
	}
}
