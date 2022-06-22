package apiautomation.apirestassured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class assignmentjsonfile 
{
public static void main(String[] args) throws FileNotFoundException
{
	
	File f=new File("../apirestassured/bodydata");
	FileReader fr=new FileReader(f);
	JSONTokener js=new JSONTokener(fr);
	JSONObject obj=new JSONObject(js);
	
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(obj.toString())
			.when()
			.post("http://localhost:3000/SeleniumFilksList");
			
			System.out.println("status code is");
			System.out.println(res.statusLine());
			System.out.println(res.asString());
	
}
}
