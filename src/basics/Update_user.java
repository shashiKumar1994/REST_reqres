package basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import pojo.Create_user_pojo;

public class Update_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/";
		Create_user_pojo cp= new Create_user_pojo();
		cp.setName("Madhu Sudhan");
		cp.setJob("Marketing");
		
		String res = given().log().all().body(cp)
		.when().put("api/users/2")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(res);
		

	}

}
