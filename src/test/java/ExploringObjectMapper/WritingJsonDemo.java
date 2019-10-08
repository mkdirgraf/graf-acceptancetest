package ExploringObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class WritingJsonDemo {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        Map<String,Object> carInfo=new LinkedHashMap<>();
        Car camry=new Car();
        camry.setColor("brown");
        camry.setModel("camry");
        camry.setYear(2018);
        carInfo.put("brand","TOYOTA");
        carInfo.put("volume",2.5);
        carInfo.put("seats","leather");
        carInfo.put("plateNumber","AF63974");
        carInfo.put("registration","Schaumburg");
        carInfo.put("ownersName","Temirlan");
        carInfo.put("ownersLastName","Kochkorov");
        carInfo.put("zipCode",60193);
        carInfo.put("address","2116 Chilmark Ln");


    

    }
}
