package model;

public class city {
	private String title;
	private float areaKm2;
	private String postalCode;
	
	//TODO pievienot validācijas set funkcijās
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getAreaKm2() {
		return areaKm2;
	}
	public void setAreaKm2(float areaKm2) {
		this.areaKm2 = areaKm2;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public city() {}
	
	public city(String title, float areaKm2, String postalCode) {
		setTitle(title);
		setAreaKm2(areaKm2);
		setPostalCode(postalCode);
	}
	
	public String toString() {
		return title + ", " + areaKm2 + " km^2 [" + postalCode + "]";
	}

}
