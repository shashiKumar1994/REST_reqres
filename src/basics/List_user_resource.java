package basics;

import io.restassured.RestAssured;
import pojo.Data_pojo;
import pojo.Users_list_pojo;

import static io.restassured.RestAssured.*;

import java.util.List;

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
		 System.out.println(res.getPage());
		 System.out.println(res.getPer_page());
		 System.out.println(res.getTotal());
		 System.out.println(res.getTotal_pages());
		 List<Data_pojo> data = res.getData();
		 for(int j=0;j<data.size();j++)
			{
				System.out.println("Name is  "+data.get(j).getName());
				System.out.println("Id is  "+data.get(j).getId());
				System.out.println("Color is "+data.get(j).getColor());
				System.out.println("Year is "+data.get(j).getYear());
				System.out.println("Pantone_value is "+data.get(j).getPantone_value());
			}

		 
		 

	}

}
