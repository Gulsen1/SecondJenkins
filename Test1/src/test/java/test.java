import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class test {
	
@Test
	public void test1() {
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}
	
	@Test
	public void test2() {
		given ().get("https://reqres.in/api/users?page=2").then().statusCode(200).contentType("application/json");
		
}
	@Test
	public void test3() {
		given().get("https://reqres.in/api/users?page=2").then().body("data.first_name",hasItems("Lindsay","Rachel"));
		
		
}
	@Test
	public void test4() {
		given().header("Content-Type","application/json").get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	
	@Test
	public void test5() {
		given().accept("ContentType.JSON").get("https://reqres.in/api/users?page=2").
		then().statusCode(200);
	}
	@Test
	public void test6() {
		given().params("page",2).get("https://reqres.in/api/users");
	}
	@Test
	public void test7() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));
	
}
	@Test
	public void test8() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));
	
}
	@Test
	public void test9() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.last_name[0]",equalTo("Lawson"));
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	