package utils;

import java.util.LinkedList;
import java.util.List;

import dao.model.BookingDTO;
import dao.model.CompletePlaceDTO;
import dao.model.CustomerDTO;
import dao.model.HotelDTO;
import model.BookingBO;
import model.CompletePlaceBO;
import model.CustomerBO;
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

	public CustomerBO translateCustomerDTOtoCustomerBO(CustomerDTO customerDTO) {
		CustomerBO customerBo = new CustomerBO();

		customerBo.setName(customerDTO.getName());
		customerBo.setCnp(customerDTO.getCnp());
		customerBo.setAddress(customerDTO.getAddress());
		customerBo.setNationality(customerDTO.getNationality());
		customerBo.setPhone(customerDTO.getPhone());
		customerBo.setUsername(customerDTO.getUsername());
		customerBo.setPassword(customerDTO.getPassword());
		customerBo.setRegistrationDate(customerDTO.getRegistrationDate());
		return customerBo;
	}
	
	public CustomerDTO translateCustomerBOtoCustomerDTO(CustomerBO customerBO) {
		CustomerDTO customerDTO = new CustomerDTO();

		customerDTO.setName(customerBO.getName());
		customerDTO.setCnp(customerBO.getCnp());
		customerDTO.setAddress(customerBO.getAddress());
		customerDTO.setNationality(customerBO.getNationality());
		customerDTO.setPhone(customerBO.getPhone());
		customerDTO.setUsername(customerBO.getUsername());
		customerDTO.setPassword(customerBO.getPassword());
		customerDTO.setRegistrationDate(customerBO.getRegistrationDate());
		return customerDTO;
	}
	
	public CompletePlaceBO translateCompletePlaceDTOtoCompletePlaceBO(CompletePlaceDTO completePlaceDTO){
		CompletePlaceBO completePlaceBo=new CompletePlaceBO();
		completePlaceBo.setName(completePlaceDTO.getPlaceToVisit().getName());
		completePlaceBo.setAddress(completePlaceDTO.getPlaceToVisit().getAddress());
		
		completePlaceBo.setDescription(completePlaceDTO.getPlaceToVisit().getDescription());
		completePlaceBo.setDistance(completePlaceDTO.getPlaceCloseToHotel().getDistance());
		completePlaceBo.setGuidance(completePlaceDTO.getPlaceCloseToHotel().getGuidance());
		completePlaceBo.setSpecifications(completePlaceDTO.getPlaceCloseToHotel().getSpecifications());
		completePlaceBo.setLat(completePlaceDTO.getPlaceToVisit().getLat());
		completePlaceBo.setLng(completePlaceDTO.getPlaceToVisit().getLng());
		completePlaceBo.setPhoto(completePlaceDTO.getPlaceToVisit().getPhoto());
		completePlaceBo.setDetailsUrl(completePlaceDTO.getPlaceToVisit().getDetailsUrl());
		
		
		return completePlaceBo;
		
	}
	
	
	public List<CompletePlaceBO> translateListOfCompletePlacesDTOtoListOfCompletePlacesBO(List<CompletePlaceDTO> listDTO) {
		List<CompletePlaceBO> listBO = new LinkedList<CompletePlaceBO>();
		for (CompletePlaceDTO completePlaceDTO: listDTO) {
			listBO.add(translateCompletePlaceDTOtoCompletePlaceBO(completePlaceDTO));
		}
		return listBO;
	}
	
	public BookingDTO translateBookingBOToBookingDTO(BookingBO bookingBO){
		BookingDTO bookingDTO=new BookingDTO();
		
		bookingDTO.setCustomerId(bookingBO.getCustomerId());
		bookingDTO.setRoomId(bookingBO.getRoomId());
		bookingDTO.setCheckin(bookingBO.getCheckin());
		bookingDTO.setCheckout(bookingBO.getCheckout());
		bookingDTO.setOtherSpecifications(bookingBO.getOtherSpecifications());
		
		return bookingDTO;
	}

}
