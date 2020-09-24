package basics;

import io.restassured.RestAssured;
import pojo.Create_user_pojo;

import static io.restassured.RestAssured.*;

public class Create_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		Create_user_pojo cp= new Create_user_pojo();
		cp.setName("Sharath");
		cp.setJob("SYstem Admin");
		String res = given().log().all().body(cp)
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		System.out.println(res);
		

	}

}
