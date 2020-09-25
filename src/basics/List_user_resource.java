package basics;

import io.restassured.RestAssured;
import pojo.Users_list_pojo;

import static io.restassured.RestAssured.*;

public class List_user_resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RestAssured.baseURI="https://reqres.in/";
		 Users_list_pojo res =given().log().all()
		.when().get("api/unknown")
		.then().log().all().statusCode(200).extract().response().as(Users_list_pojo.class);
		 System.out.println(res.getAd().getCompany());
		 System.out.println(res.getAd().getText());
		 System.out.println(res.getAd().getUrl());

	}

}
