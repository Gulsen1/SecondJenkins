
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class Test2 {
	
		
	public class Test1 {
@Test
	    public void test1() {
			given().get("https://regresin/api/users?page=2").then().statusCode(201);
		}

		
		}


}
