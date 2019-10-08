package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;


public class HamcrestDemo {


    @Test
    public void test1(){
        RestAssured.baseURI="http://www.postalpincode.in/api/pincode/560100";
       Response response=given()
                .log().all()
                .accept("application/json")
                .contentType("application/json")
                .when().get()
               .then()
               .statusCode(200)
               .body("PostOffice[0].Name",equalTo("Electronics City"),"PostOffice.Name",hasItem("Electronics City"))
               .extract().response();





    }

}
