package controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.log.LogFactory;

import business.HotelinhoBusinessServices;
import dao.model.HotelDTO;
import dao.model.PlaceCloseToHotelDTO;
import dao.model.RoomDTO;
import model.HotelBO;
import model.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
	public static final Logger LOG = LoggerFactory.getLogger(HotelsController.class);
	@Autowired
	private HotelinhoBusinessServices business;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDTO> getAllHotels() {
		return business.getAllCourses();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HotelBO getHotelById(@PathVariable String id) throws ResourceNotFoundException {
		return business.getHotelById(id);
	}

	@RequestMapping(value = "/{id}/rooms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RoomDTO> getRoomsForHotel(@PathVariable String id) throws ResourceNotFoundException {
		return business.getRoomsForHotel(id);
	}

	@RequestMapping(value = "/filtered", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDTO> filterHotelsByFacilities(@RequestParam Map<String, String> parameters) {
		return business.filterHotelsByFacilities();
	}

	@RequestMapping(value = "/{id}/places", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PlaceCloseToHotelDTO> getPlacesCloseToHotel(@PathVariable String id) {
		// return business.getPlacesCloseToHotel(id);
		return null;
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleResourceNotFoundException(ResourceNotFoundException error) {
		LOG.error(error.getMessage());
		return error.getMessage();

	}

}
