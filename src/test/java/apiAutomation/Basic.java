package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Basic {

    /**
     * Api automation in rest assured is bdd format
     * given, when, then
     * <p>
     * given()--> i have this information
     * when()-->I perfrom some action
     * then()-->this should be the output
     * <p>
     * Note:
     * baseUri/baseUrl--->https://maps.googleapis.com
     * ResourcePath------->/maps/api/distancematrix/json
     */


    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api";


    }

    //https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=YOUR_API_KEY
    @Test
    public void test1() {
        Response response = given()
                .log().all()
                .param("units", "imperial")
                .param("origins", "Washington,DC")
                .param("destinations", "New+York+City,NY")
                .param("key", "").log().uri().
                        when().get("/distancematrix/json")
                .then().statusCode(500).extract().response();

    }

    @Test
    public void test2() {
        //given().auth().oauth()


    }

}
