package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

public class simplejsonusingpojo 
{
	

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	private String firstname;
	private String lastname;
	private String id;
	private String designation;
	private pojoaddess address;
	public pojoaddess getAddress() {
		return address;
	}
	public void setAddress(pojoaddess address) {
		this.address = address;
	}
	
	
}
