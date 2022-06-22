package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class practice1 
{
public static void main(String[] args) 
{
	JSONObject innerobj=new JSONObject();
	innerobj.put("bldg name", "chintamani heights");
	innerobj.put("road name", "senapati bapat road");
	innerobj.put("area", "ambegaon bk");
	
	JSONObject outerobj=new JSONObject();
	outerobj.put("first name", "shashank");
	outerobj.put("lastname", "chindarkar");
	outerobj.put("designation", "STL");
	outerobj.put("address", innerobj);
	outerobj.put("id", "sc5");
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(outerobj.toString())
	.when()
	.post("http://localhost:3000/PerformanceFolksList");
	
	System.out.println("status code is");
	System.out.println(res.statusCode());
}
}
