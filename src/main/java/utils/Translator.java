package utils;

import dao.model.HotelDTO;
import model.HotelBO;

public class Translator {

	public HotelBO translateHotelDTOtoHotelBO(HotelDTO hotelDTO){
		HotelBO hotelBO=new HotelBO();
		
		hotelBO.setName(hotelDTO.getName());
		hotelBO.setAddress(hotelDTO.getAddress());
		hotelBO.setNrStars(hotelDTO.getNrStars());
		hotelBO.setAvailableRooms(hotelDTO.getAvailableRooms());
		hotelBO.setPool(hotelDTO.hasAirConditioning());
		hotelBO.setRestaurant(hotelDTO.hasRestaurant());
		hotelBO.setPlayground(hotelDTO.hasPlayground());
		hotelBO.setParking(hotelDTO.hasParking());
		hotelBO.setWireless(hotelDTO.hasWireless());
		hotelBO.setRoomService(hotelDTO.hasRoomService());
		hotelBO.setAirConditioning(hotelDTO.hasAirConditioning());
		
		return hotelBO;
	}
}
