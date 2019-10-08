import cucumber.api.java.Before;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RunningTests {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "//maps.googleapis.com";
        RestAssured.basePath = "/maps/api";
    }


    @Test
    public static void testingApi() {

    }
}
