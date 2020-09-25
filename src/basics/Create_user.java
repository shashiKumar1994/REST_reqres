package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import pojo.Create_user_pojo;

import static io.restassured.RestAssured.*;

public class Create_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		/*Create_user_pojo cp= new Create_user_pojo();
		cp.setName("Sharath");
		cp.setJob("System Admin");*/
		
		String res = given().log().all().body("Request\r\n" + 
				"/api/users\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(res);
		
		/*JsonPath jp= new JsonPath(res);
		System.out.println(jp.getString("name"));
		System.out.println(jp.getString("job"));
		System.out.println(jp.getString("id"));
		System.out.println(jp.getString("createdAt"));*/
		
		
		

	}

}
