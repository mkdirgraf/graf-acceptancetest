package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetRequestDemo {

    /*
    Note: You can log uri,header,ifError(), all(), ifValidationFailed(), we can use them anywhere in our test, to log these information
    given()--->we provide the precondition(what I have) like headers, parameters( for Path params-->pathParam(k,v), for query Param-->queryParam(k,v))
   ) when()-->is the condition, what type of Request we want to send
   then()-->is the validation part of response body, status code
   .prettyPrint()--->prints out the response body in json format
   Note: If Accept type is "application/json" , then we can use JsonPath json=new JsonPath(response);
  and using JsonPath methods we can read the data from json body
  Note: If Accept type is "application/xml", then we can use XMLPath

  Note: Response interface, whenever we use it don't forget to put at the end extract().response();
  hasItem()---> creates matcher for Iterables that only matches when a single pass over the examined iterable yields, and don't mention
  the index of the array
     */


    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api/";
    }

//    @Test
//    public void test1() {
//        Response response = given()
//                .queryParam("units", "imperial")
//                .queryParam("origins", "Washington,DC")
//                .queryParam("destinations", "New+York+City,NY")
//                .queryParam("key", "AIzaSyA5wGn0_QP67ZJYTphIaKYS-p_Lapsr33M")
//                .contentType("application/json")
//                .accept("application/json")
//                .log().all()
//                .when()
//                .get("distancematrix/json")
//                .then()
//                .statusCode(200)
//                .extract().response();
//        JsonPath jsonPath = new JsonPath(response.asString());
//        Assert.assertTrue(jsonPath.get("destination_addresses[0]").equals("New York, NY, USA"), "is not equal to");
//        Assert.assertTrue(jsonPath.get("rows[0].elements[0].distance.text").equals("226 mi"));
//
//
//    }

    @Test
    public void test2(){
        Response response = given()
                .log().all()
                .queryParam("units", "imperial")
                .queryParam("origins", "Washington,DC")
                .queryParam("destinations", "New+York+City,NY")
                .queryParam("key", "AIzaSyA5wGn0_QP67ZJYTphIaKYS-p_Lapsr33M")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().body("")
                .get("distancematrix/json")
                .then()
                .statusCode(200)
                .body("destination_addresses[0]",equalTo("New York, NY, USA"),"rows[0].elements[0].distance.text",equalTo("226 mi")
                )
                .log().everything()
                .extract().response();
        JsonPath jsonPath=new JsonPath(response.toString());




//http://www.postalpincode.in/api/pincode/560100---endpoint


    }



}
