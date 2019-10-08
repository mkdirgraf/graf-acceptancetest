package apiAutomation;

import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FullDemo {

    RequestSpecBuilder requestBuilder;
    RequestSpecification requestSpecification;


    @BeforeClass
    public void setUp() {
        requestBuilder = new RequestSpecBuilder();
        requestBuilder.setBaseUri("https://maps.googleapis.com");
        requestBuilder.setBasePath("/maps/api/");
        requestBuilder.setAccept("application/json");
        requestBuilder.setContentType("application/json");
        requestBuilder.addQueryParam("units", "imperial", "origins", "Washington,DC");
        requestBuilder.addQueryParam("origins", "Washington,DC");
        requestBuilder.addQueryParam("destinations", "New+York+City,NY");
        requestBuilder.addQueryParam("key", "AIzaSyA5wGn0_QP67ZJYTphIaKYS-p_Lapsr33M");
        requestSpecification = requestBuilder.build();
    }
//https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=Washington,DC&destinations=New+York+City,NY&key=AIzaSyA5wGn0_QP67ZJYTphIaKYS-p_Lapsr33M


    @Test
    public void test1() {
        Response response = given()
                .spec(requestSpecification)
                .log().all()
                .when()
                .get("distancematrix/json")
                .then()
                .statusCode(200).extract().response();

    }

    @Test
    public void test2() {


    }


}
