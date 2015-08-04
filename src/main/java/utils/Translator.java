package utils;

import java.util.LinkedList;
import java.util.List;

import dao.model.HotelDTO;
import model.HotelBO;

public class Translator {

	public HotelBO translateHotelDTOtoHotelBO(HotelDTO hotelDTO) {
		HotelBO hotelBO = new HotelBO();

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

	public HotelDTO translateHotelBOtoHotelDTO(HotelBO hotelBO) {
		HotelDTO hotelDTO = new HotelDTO();

		hotelDTO.setId(null);
		hotelDTO.setName(hotelBO.getName());
		hotelDTO.setAddress(hotelBO.getAddress());
		hotelDTO.setNrStars(hotelBO.getNrStars());
		hotelDTO.setAvailableRooms(hotelBO.getAvailableRooms());
		hotelDTO.setPool(hotelBO.isPool());
		hotelDTO.setRestaurant(hotelBO.isRestaurant());
		hotelDTO.setPlayground(hotelBO.isPlayground());
		hotelDTO.setParking(hotelBO.isParking());
		hotelDTO.setWireless(hotelBO.isWireless());
		hotelDTO.setRoomService(hotelBO.isRoomService());
		hotelDTO.setAirConditioning(hotelBO.isAirConditioning());

		return hotelDTO;

	}

	public List<HotelBO> transateListOfHotelsDTOtoListOfHotelsBO(List<HotelDTO> listDTO) {
		List<HotelBO> listBO = new LinkedList<HotelBO>();
		for (HotelDTO hotel : listDTO) {
			listBO.add(translateHotelDTOtoHotelBO(hotel));
		}
		return listBO;
	}

	public List<HotelDTO> translateListOfHotelsBOtoListOfHotelsDTO(List<HotelBO> listBO) {
		List<HotelDTO> listDTO = new LinkedList<HotelDTO>();
		for (HotelBO hotel : listBO) {
			listDTO.add(translateHotelBOtoHotelDTO(hotel));
		}
		return listDTO;
	}
}
