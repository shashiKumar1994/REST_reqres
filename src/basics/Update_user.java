package basics;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojo.Create_user_pojo;

public class Update_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/";
		Create_user_pojo cp= new Create_user_pojo();
		cp.setName("Madhu Sudhan");
		cp.setJob("Marketing");
		
		/*String res = given().log().all().body(cp)
		.when().put("api/users/2")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(res);*/
		
		RequestSpecification req = RestAssured.given().log().all().body(cp);
		Response resp = req.put("api/users/2");
		int status_code = resp.getStatusCode();
		System.out.println(status_code);
		ResponseBody body = resp.getBody();
		System.out.println(body);
		JsonPath pre_parse = resp.jsonPath();
		System.out.println(pre_parse.getString("name"));
		System.out.println(pre_parse.getString("job"));
		System.out.println(pre_parse.getString("updatedAt"));
		
		

	}

}
