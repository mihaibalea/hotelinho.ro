package controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import business.HotelinhoBusinessServices;
import dao.model.HotelDTO;
import dao.model.RoomDTO;
import model.BookingBO;
import model.CompletePlaceBO;
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
		return business.getAllHotels();
	}

	// @RequestMapping(method = RequestMethod.GET, produces =
	// MediaType.APPLICATION_JSON_VALUE)
	// public ModelAndView getAllHotels(){
	// ModelAndView modelPage=new ModelAndView("hotels");
	// modelPage.addObject("hotels",business.getAllHotels());
	// return modelPage;
	// }

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HotelBO getHotelById(@PathVariable String id) throws ResourceNotFoundException {
		return business.getHotelById(id);
	}

	@RequestMapping(value = "/{id}/rooms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RoomDTO> getRoomsForHotel(@PathVariable String id) throws ResourceNotFoundException {
		return business.getRoomsForHotel(id);
	}

	@RequestMapping(value = "/{id}/room", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createNewBooking(@PathVariable String id, @RequestParam(value = "id") String roomId,
			@RequestBody BookingBO bookingBO) throws ParseException {
		bookingBO.setRoomId(roomId);
		business.createNewBooking(bookingBO);
	}

	@RequestMapping(value = "/filter", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDTO> filterHotelsByFacilities(@RequestParam Map<String, String> parameters) {
		HotelBO hotelBO = new HotelBO();
		hotelBO.setPool(parameters.get("pool").equals("YES"));
		hotelBO.setRestaurant(parameters.get("restaurant").toString().equals("YES"));
		hotelBO.setPlayground(parameters.get("playground").equals("YES"));
		hotelBO.setParking(parameters.get("parking").equals("YES"));
		hotelBO.setWireless(parameters.get("wireless").equals("YES"));
		hotelBO.setRoomService(parameters.get("roomService").equals("YES"));
		hotelBO.setAirConditioning(parameters.get("airConditioning").equals("YES"));

		return business.filterHotelsByFacilities(hotelBO);
	}

	@RequestMapping(value = "/{id}/places", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompletePlaceBO> getPlacesForHotel(@PathVariable String id) {
		return business.getPlacesForHotel(id);
	}

	@RequestMapping(value = "/{id}/room", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RoomDTO getSelectedRoom(@PathVariable String id, @RequestParam(value = "id") String roomId)
			throws ResourceNotFoundException {
		LOG.debug(id + " " + roomId);
		return business.getSelectedRoom(id, roomId);

	}

	// ***********************************************************************************************
	// *************>>>>>>>>>>>>>> Exception handler functions
	// <<<<<<<<<<<<<<*********************
	// ***********************************************************************************************

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleResourceNotFoundException(ResourceNotFoundException error) {
		LOG.error(error.getMessage());
		return error.getMessage();

	}

}
