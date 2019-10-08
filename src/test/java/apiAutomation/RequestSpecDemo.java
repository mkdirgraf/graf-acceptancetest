package apiAutomation;

import common.utils.ConfigurationReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RequestSpecDemo {

    static RequestSpecBuilder builder;
    public static RequestSpecification requestSpec;


    @BeforeClass
    public void setUp() {
        builder = new RequestSpecBuilder();
        builder.setBaseUri(ConfigurationReader.getPropertyKey("configuration","baseUri"));
        builder.setBasePath(ConfigurationReader.getPropertyKey("configuration","basePath"));
        System.out.println(ConfigurationReader.getPropertyKey("configuration","baseUri"));

    }

    @Test
    public void test(){}


}
