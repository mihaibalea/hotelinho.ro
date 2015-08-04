package dao.model;

public class PlaceCloseToHotelDTO {

	private String id;
	private String placeId;
	private String hotelId;
	private int distance;
	private String guidance;
	private String specifications;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getGuidance() {
		return guidance;
	}

	public void setGuidance(String guidance) {
		this.guidance = guidance;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

}
