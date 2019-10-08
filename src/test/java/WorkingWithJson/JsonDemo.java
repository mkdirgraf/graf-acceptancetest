package WorkingWithJson;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class JsonDemo {

    public String generateStringFromResourse(String path) throws IOException{
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    @Test
    public void test1() throws IOException{

        String jsonDemo=generateStringFromResourse("C:\\Users\\Tima\\IdeaProjects\\tkacceptancetest\\src\\test\\resources\\data\\employee.json");
        RestAssured.baseURI="https://google.com";
        RestAssured.basePath="/maps/api/";

        given()
                .body(jsonDemo)
                .log().all()
                .when()
                .post()
                .then()
                .statusCode(404);




    }
}
