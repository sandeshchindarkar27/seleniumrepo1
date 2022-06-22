package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class assignmentarraydata 
{
public static void main(String[] args)
{
	JSONObject permanentaddres=new JSONObject();
	permanentaddres.put("SurveyNO","55/7");
	permanentaddres.put("Society","Chintamani Heights");
	permanentaddres.put("Area","Ambegaon");
	permanentaddres.put("City","Pune");
	
	JSONObject billingaddres=new JSONObject();
	billingaddres.put("SurveyNO","55/7");
	billingaddres.put("Society","Chintamani Heights");
	billingaddres.put("Area","Ambegaon");
	billingaddres.put("City","Pune");
	
	JSONArray address=new JSONArray();
	address.put(0,permanentaddres);
	address.put(1,billingaddres);
	
	JSONObject basicinfo=new JSONObject();
	basicinfo.put("Firstname","Shashank");
	basicinfo.put("Lastname","Chindarkar");
	basicinfo.put("Designation","Manager");
	basicinfo.put("id","sc9");
	basicinfo.put("Address",address);
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(basicinfo.toString())
	.when()
	.post("http://localhost:3000/SeleniumFilksList");
	
	System.out.println("status code is");
	System.out.println(res.statusLine());
	System.out.println(res.asString());
}
}
