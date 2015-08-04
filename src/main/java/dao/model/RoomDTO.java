package dao.model;

public class RoomDTO {
	private String id;
	private String hotelId;
	private int roomNumber;
	private String type;
	private int nrBeds;
	private boolean fridge;
	private boolean tv;
	private boolean minibar;
	private boolean phone;
	private boolean airConditioning;
	private boolean balcony;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNrBeds() {
		return nrBeds;
	}

	public void setNrBeds(int nrBeds) {
		this.nrBeds = nrBeds;
	}

	public boolean isFridge() {
		return fridge;
	}

	public void setFridge(boolean fridge) {
		this.fridge = fridge;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isMinibar() {
		return minibar;
	}

	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}

	public boolean isPhone() {
		return phone;
	}

	public void setPhone(boolean phone) {
		this.phone = phone;
	}

	public boolean isAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

}
