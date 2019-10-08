package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

import static io.restassured.RestAssured.given;

public class FullDemoApi {

    private static RequestSpecification requestSpecification;
    private static RequestSpecBuilder requestSpecBuilder;
    private static ResponseSpecBuilder responseBuilder;
    private static ResponseSpecification responseSpecification;
    private static Logger logger = LoggerFactory.getLogger(FullDemoApi.class);
    public static Event event;

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://api.lyrics.ovh/v1/";
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType("application/json");
        requestSpecBuilder.addPathParam("name", "shakira");
        requestSpecBuilder.addPathParam("listName", "loca");
        requestSpecBuilder.setAccept("application/json");
        requestSpecification = requestSpecBuilder.build();
        responseBuilder = new ResponseSpecBuilder();
        responseBuilder.expectStatusCode(200);
        responseBuilder.expectContentType("application/json");
       // responseBuilder.expectBody("lyrics", Matchers.equalTo("Shakira\\nLoca...\\nLoca...\\nDance or die...\\nLoca...\\nLoca...\\n\\nShe's playing dumb all the time\\nJust to keep it fun\\nTo get you on like ah\\nBe careful amigo\\nShe talking and walking just to work you up\\nAnd she'd die for your love\\nBut your love's only mine, now\\nYo sigo tranquila\\nLike I'm on a beach in Anguilla\\nSipping my Corona\\nLike there's nothin' goin' on\\nI ain't leavin' you alone\\nWhat is meant for me\\nNo other girl is gonna take it\\nSo give him up\\n\\nAnd I'm crazy, but you like it (loca, loca, loca)\\nAnd you like that it ain't easy (loca, loca, loca)\\nAnd I'm crazy but you like it (loca, loca, loca)\\nI'm Crazy but you like it\\n\\nDizzee\\nThat girl is a nutter\\nHot though, I heat up when I touch her\\nChica caliente got me rapping to merengue\\nI feel so el presidente\\nI'm runnin' shit and I'm lovin' it\\nShe's got a mean ol'bumper you should\\nSee what she does with it\\nShe dip it down low (down low, down low)\\nI can never get enough (oh no, oh no)\\nShe give me the runaround,\\nBut I stay chasin'\\nBut I need help I'm in love\\nWith a crazy girl\\nBut it's all good\\nAnd it's fine by me\\nJust as long as I hear her say, \\\"Ay, papi\\\"\\n\\nShakira\\nAnd I'm crazy, but you like it (loca, loca, loca)\\nYou like that it ain't easy (loca, loca, loca)\\nI'm crazy but you like it\\nCrazy but you like it (loca, loca, loca)\\n\\nYou're the one for me\\nAnd for her no more\\nNow you think she's got it all\\nI got one kiki\\n\\nYou're the one for me\\nAnd for her no more\\nThough you think she's got it all\\nI got my kiki\\n\\nShakira\\nOk she doesn't know the the things that I do to please you\\nI take you to the malecón por un caminito\\nThey saw your girlfriend looking for me with a rifle\\n'Cause we were dancing mambo\\nWhat she don't allow?\\n\\nDizzee Rascal\\nI really can't help it\\nIf I make the lady loca\\nI don't want no trouble\\nI just wanna hit the (Ooh!)\\n\\nShakira\\nAnd I'm crazy, but you like it\\n'Cause the kinda girl like me\\nThey are running out of in the market\\n\\nAnd I'm crazy, but you like it (loca, loca, loca)\\nYou like that it ain't easy (loca, loca, loca)\\nI'm crazy but you like it (loca, loca, loca)\\nCrazy but you like it (Dios Mío)\\n\\nDizzee\\nThat girl is (loca)\\nThat girl is (loca)\\nThat girl is (loca)\\nLoca\\nThat girl is (loca)\\nThat girl is (loca)\\n\\nShakira\\nYou're the one for me\\nAnd for her no more\\nNow you think she's got it all\\nI got my kiki\\n\\nAnd I'm crazy, but you like it (loca, loca, loca)\\nYou like that it ain't easy (loca, loca, loca)\\nLa loca, la loca, la loca (loca)\\nLoca (loca)\\n\\n(Loca, loca, loca)"));
        responseSpecification = responseBuilder.build();
    }

    @Test
    public void test1() {



        given()
                .spec(requestSpecification)
                .log().all()
                .when().get("{name}/{listName}")
                .then().spec(responseSpecification);




    }
}
