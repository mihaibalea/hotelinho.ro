package model;

public class HotelBO {
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

	public boolean hasPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean hasRestaurant() {
		return restaurant;
	}

	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}

	public boolean hasPlayground() {
		return playground;
	}

	public void setPlayground(boolean playground) {
		this.playground = playground;
	}

	public boolean hasParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean hasWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean hasRoomService() {
		return roomService;
	}

	public void setRoomService(boolean roomService) {
		this.roomService = roomService;
	}

	public boolean hasAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

}
