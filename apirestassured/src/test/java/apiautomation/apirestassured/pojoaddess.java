package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

public class pojoaddess 
{
    private String houseno;
    private String street;
    private String area;
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
    
}
