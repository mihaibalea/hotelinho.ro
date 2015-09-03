package dao.model;

public class HotelDTO {
	private String id;
	private String name;
	private String address;
	private int nrStars;
	private int availableRooms;
	private boolean pool;
	private boolean restaurant;
	private boolean playground;
	private boolean parking;
	private boolean wireless;
	private boolean roomService;
	private boolean airConditioning;
	private String lat;
	private String lng;
	private String photo;
	private String description;
	private String shortDescription;
	private String nearbyPlacesUrl;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getNearbyPlacesUrl() {
		return nearbyPlacesUrl;
	}

	public void setNearbyPlacesUrl(String nearbyPlacesUrl) {
		this.nearbyPlacesUrl = nearbyPlacesUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNrStars() {
		return nrStars;
	}

	public void setNrStars(int nrStars) {
		this.nrStars = nrStars;
	}

	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isRestaurant() {
		return restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isPlayground() {
		return playground;
	}

	public void setPlayground(boolean playground) {
		this.playground = playground;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isRoomService() {
		return roomService;
	}

	public void setRoomService(boolean roomService) {
		this.roomService = roomService;
	}

	public boolean isAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
