package basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static  io.restassured.RestAssured.*;

public class Get_Singleuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String response=RestAssured.baseURI="https://reqres.in/";
		given().log().all()
		 .when().get( "/api/users/2")
		 .then().log().all().assertThat().statusCode(200).extract().response().asString();
		 System.out.println(response);
		 JsonPath jp=new JsonPath(response);
		System.out.println(jp.getString("data.id"));

	}

}
