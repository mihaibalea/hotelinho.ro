package dao.model;

public class PlaceToVisitDTO {
	private String id;
	private String name;
	private String address;
	private String type;
	private boolean carAcces;
	private String description;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isCarAcces() {
		return carAcces;
	}
	public void setCarAcces(boolean carAcces) {
		this.carAcces = carAcces;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
