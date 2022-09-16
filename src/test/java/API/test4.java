package API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class test4 {
	@Test
	void test1() {
		baseURI = "https://api.punkapi.com";
		int a = 20;
		given().
			get("/v2/beers?page=2&per_page="+a).
		then().
			assertThat().statusCode(200).
		and().
			log().all();
		
	}
	@Test
	void test2() {
		baseURI = "https://api.punkapi.com";
		int a = 5;
		given().
			get("/v2/beers?page=2&per_page="+a).
		then().
			assertThat().statusCode(200).
		and().
			log().all();
		
	}
	@Test
	void test3() {
		baseURI = "https://api.punkapi.com";
		int a = 1;
		given().
			get("/v2/beers?page=2&per_page="+a).
		then().
			assertThat().statusCode(200).
		and().
			log().all();
		
	}
}
