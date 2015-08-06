package model;

public class CompletePlaceBO {
	private String name;
	private String address;
	private String type;
	private boolean carAcces;
	private String description;
	private int distance;
	private String guidance;
	private String specifications;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public boolean isCarAcces() {
		return carAcces;
	}

	public void setCarAcces(boolean carAcces) {
		this.carAcces = carAcces;
	}

}
