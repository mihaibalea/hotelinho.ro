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
		hotelBO.setPool(hotelDTO.isPool());
		hotelBO.setRestaurant(hotelDTO.isRestaurant());
		hotelBO.setPlayground(hotelDTO.isPlayground());
		hotelBO.setParking(hotelDTO.isParking());
		hotelBO.setWireless(hotelDTO.isWireless());
		hotelBO.setRoomService(hotelDTO.isRoomService());
		hotelBO.setAirConditioning(hotelDTO.isAirConditioning());
		return hotelBO;
	}
}
