import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;


public class Post_Test {
	
	@Test
	public void Test_post1() {
		JSONObject request= new JSONObject();
		request.put("name","ali");
		request.put("job", "doctor");
		given().body(request.toJSONString()).
		when().post("https://reqres.in/api/users").then().statusCode(201)
			.log().all();
		
		
		
		
	}
	@Test
	public void Test_post2() {
		JSONObject request= new JSONObject();
		request.put("name","ali");
		request.put("job", "doctor");
		given().contentType(ContentType.JSON).accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).
	    when().post("https://reqres.in/api/users").then().statusCode(201)
			.log().all();
		
		
		

	
	}@Test
	public void Test_patch() {
		JSONObject request= new JSONObject();
		
		request.put("job","teacher");
		given().contentType(ContentType.JSON).accept(ContentType.JSON).  
		header("Content-Type","application/json").
		body(request.toJSONString()).
	    when().patch("https://reqres.in/api/users/2").then().statusCode(200)
			.log().all();
		

}@Test
	public void Test_put1() {
	JSONObject request= new JSONObject();
	request.put("name","mehmet");
	request.put("job","teacher");
	
	given().contentType(ContentType.JSON).accept(ContentType.JSON).
	header("Content-Type","application/json").
	body(request.toJSONString()).
    when().patch("https://reqres.in/api/users/2").then().statusCode(200)
		.log().all();
}
}
