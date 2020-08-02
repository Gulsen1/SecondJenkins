import static io.restassured.RestAssured.*;
import org.testng.annotations.*;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;


public class Serilization {
	@Test 
	
public void Test1() {
		baseURI= "http://localhost:3000";
		
		Object obj= new Object();
		obj.setName("Yasemin");
		obj.setJob("student");
		obj.setTopic("Jenkins");
		obj.setTopicId(3);
		
		given().
		contentType(ContentType.JSON).
		body(obj,ObjectMapperType.GSON).
		when().post("/users").
		then().statusCode(201).log().all();
	}
	// deserilization... Data (Json) -> POJO
	@Test
	public void Test1b() {
		baseURI = "http://localhost:3000";
		Message xyz = get("/message").as(Message.class,ObjectMapperType.GSON);
		xyz.setMessage("hello, it is deserilization");
		
		}
	
	

}
