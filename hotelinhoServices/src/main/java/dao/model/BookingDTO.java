package dao.model;

import java.sql.Date;

public class BookingDTO {
	private String id;
	private String customerId;
	private String roomId;
	private Date checkin;
	private Date checkout;
	private String otherSpecifications;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public String getOtherSpecifications() {
		return otherSpecifications;
	}
	public void setOtherSpecifications(String otherSpecifications) {
		this.otherSpecifications = otherSpecifications;
	}
	
	

}
