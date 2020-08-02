    import org.testng.annotations.Test;
	import static io.restassured.RestAssured.*;
	import org.json.simple.JSONObject;
	import io.restassured.http.ContentType;


public class localHs {
     //   @Test
		public void get_test1a() {
		baseURI  ="http://localhost:3000/";
		JSONObject request=new JSONObject();
		request.put("name", "Ahmet");
		request.put("job", "postman");
			given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
			when().post("/users").
			then().statusCode(201).log().all();
			
			
		}
		//patch request test
		//@Test
		public void get_test1b() {
		baseURI  ="http://localhost:3000/";
		JSONObject request=new JSONObject();
		request.put("job", "professor");
			given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
			when().patch("/users/2").
			then().statusCode(200).
		      log().all();
		}
		
		//put request
		//@Test
				public void get_test1c() {
				baseURI  ="http://localhost:3000/";
				JSONObject request=new JSONObject();
				request.put("name", "Billy");
				request.put("job", "professor");
					given().
					contentType(ContentType.JSON).
					body(request.toJSONString()).
					when().put("/users/7").
					then().statusCode(200).
				      log().all();
					}
				
				//DELETE REQUEST
				
				//@Test
				public void get_test1d() {
				baseURI  ="http://localhost:3000/";
			         given().
					contentType(ContentType.JSON).
					when().delete("/users/6").
					then().statusCode(200).
				      log().all();
					}
		
		@Test
		public void get_test2a() {
		baseURI  ="http://localhost:3000/";
			given().
			param("topic","RestAssured").
			get("/topics").
			then().
			statusCode(200).log().all();
			}
		@Test
		public void get_test2b() {
		baseURI  ="http://localhost:3000/";
			given().
			param("name","kerim").param("job","teacher").
			get("/users").
			then().
			statusCode(200).log().all();
			
			}@Test
		public void get_test2c() {
		baseURI  ="http://localhost:3000/";
			given().
			param("topic","Postman").param("topicId","1").
			get("/topics").
			then().
			statusCode(200).log().all();
			}
			
			
			
			//@Test
		public void post_test5a() {
			JSONObject request = new JSONObject();
			request.put("name", "Hasan");
			request.put("job", "dentist");
			request.put("topicId", 4);
						
			baseURI = "http://localhost:3000/";
			given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
			when().
			post("/users").
			then().statusCode(201).
			log().all();}
	//@Test
public void patch_test6a() {
	JSONObject request = new JSONObject();
	request.put("name", "Mehmet");
					
	baseURI = "http://localhost:3000/";
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	header("Content-Type","application/json").
	body(request.toJSONString()).
	when().patch("/users/5").
	then().statusCode(200).log().all();}

}


