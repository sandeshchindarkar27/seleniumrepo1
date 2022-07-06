package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

import org.apache.http.client.protocol.ResponseAuthCache;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postrequest 
{
	public static void main(String[] args) 
	{
		JSONObject is=new JSONObject();
		is.put("Sr.no.", "55/7");
		is.put("flat no", "7");
		is.put("residency", "chintamani heights");
		is.put("landmark", "sun bright school");
		
		
		JSONObject js=new JSONObject();
		js.put("FirstName", "Sandesh");
		js.put("LastName", "Chindarkar");
		js.put("id", "SC10");
		js.put("designation", "TL");
		js.put("address", is);
		
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/APIFolksList");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
	}
}
