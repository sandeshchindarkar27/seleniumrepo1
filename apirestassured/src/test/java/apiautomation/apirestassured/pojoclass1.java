package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

import java.net.http.HttpResponse.BodyHandler;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class pojoclass1 

{
public static void main(String[] args) 
{
	pojoaddess addressinfo=new pojoaddess();
	addressinfo.setHouseno("11234");
	addressinfo.setStreet("senapatibapat road");
	addressinfo.setArea("ambegaon");
	
	
	
	
	simplejsonusingpojo basic=new simplejsonusingpojo();
	basic.setFirstname("Sandesh");
	basic.setLastname("Chindarkar");
	basic.setId("SC12");
	basic.setDesignation("Senior Manager");
	basic.setAddress(addressinfo);

	
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(basic)
	.when()
	.post("http://localhost:3000/APIFolksList");
	
	
	System.out.println("status code is");
	System.out.println(res.statusCode());
	System.out.println("Response");
	System.out.println(res.asString());
}
}
