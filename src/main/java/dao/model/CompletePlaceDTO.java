package dao.model;

public class CompletePlaceDTO {

	private PlaceToVisitDTO placeToVisit;
	private PlaceCloseToHotelDTO placeCloseToHotel;

	public PlaceToVisitDTO getPlaceToVisit() {
		return placeToVisit;
	}

	public void setPlaceToVisit(PlaceToVisitDTO placeToVisit) {
		this.placeToVisit = placeToVisit;
	}

	public PlaceCloseToHotelDTO getPlaceCloseToHotel() {
		return placeCloseToHotel;
	}

	public void setPlaceCloseToHotel(PlaceCloseToHotelDTO placeCloseToHotel) {
		this.placeCloseToHotel = placeCloseToHotel;
	}

}
