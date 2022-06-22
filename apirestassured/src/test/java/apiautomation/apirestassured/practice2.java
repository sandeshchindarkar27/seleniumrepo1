package apiautomation.apirestassured;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import groovyjarjarantlr4.v4.codegen.model.decl.CodeBlock;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class practice2 
{
public static void main(String[] args) 
{
	JSONObject iobj=new JSONObject();
	iobj.put("Specialization","Electronics");
	iobj.put("Percentage","61%");
	iobj.put("Grade","FirstClass");
	
	
	JSONObject oobj=new JSONObject();
	oobj.put("Firstname","Sandesh");
	oobj.put("Lastname","Chindarkar");
	oobj.put("Educationdetails",iobj);
	oobj.put("id","sc8");
	
	System.out.println(oobj);
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(oobj.toString())
	.when()
	.post("http://localhost:3000/AutomationFolksList");
	
	System.out.println("status code is");
	System.out.println(res.statusCode());
}
}
