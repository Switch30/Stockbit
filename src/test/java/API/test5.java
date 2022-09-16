package API;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class test5 {
	@Test
	void test() {
		
		baseURI = "https://api.punkapi.com/v2/beers";
		given().
			get(baseURI).
		then().
			assertThat().statusCode(200).
			body(matchesJsonSchemaInClasspath("schema.json")).log().all();
		
	}
}
