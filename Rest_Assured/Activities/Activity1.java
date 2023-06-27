import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Activity1 {
    @Test(priority=1)
    public void postdetails(){
         baseURI="https://petstore.swagger.io/v2/pet";
         String reqBody="{\n" +
                 "  \"id\": 9901,\n" +
                 "  \"name\": \"Chocolate\",\n" +
                 "  \"status\": \"alive\"\n" +
                 "}";
        Response response =given().contentType(ContentType.JSON).body(reqBody).when().post(baseURI);
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // Assertions

        response.then().body("id", equalTo(9901));
        response.then().body("name", equalTo("Chocolate"));
        response.then().body("status", equalTo("alive"));
    }
    @Test(priority = 2)
    public void getdetails(){
        baseURI="https://petstore.swagger.io/v2/pet/";

        Response response =given().contentType(ContentType.JSON).when().pathParam("petId","9901").get(baseURI+"{petId}");
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // Assertions
response.then().statusCode(200);
        response.then().body("id", equalTo(9901));
        response.then().body("name", equalTo("Chocolateey"));
        response.then().body("status", equalTo("alive"));
    }
    @Test(priority = 3)
    public void deletedetails(){
        baseURI="https://petstore.swagger.io/v2/pet/";

        Response response =given().contentType(ContentType.JSON).when().pathParam("petId","9901").delete(baseURI+"{petId}");
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // Assertions

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("9901"));

    }
}