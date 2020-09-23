package basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Get_Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		String response=given().log().all()
		 .when().get( "api/users?page=2")
		 .then().log().all().assertThat().statusCode(200).extract().response().asString();
		 System.out.println(response);
		 JsonPath jp=new JsonPath(response);
		System.out.println(jp.getString("page"));
		System.out.println(jp.getString("per_page"));
		System.out.println(jp.getString("total"));
		System.out.println(jp.getString("total_pages"));


	}

}
