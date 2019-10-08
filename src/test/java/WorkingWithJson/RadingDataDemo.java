package WorkingWithJson;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class RadingDataDemo {
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();

        try{
            mapper.writeValue(new File("src/test/resources/data/employee.json"),new Staff());

        }catch (Exception e){
            e.printStackTrace();
        }


        }




    Staff staff=new Staff();

}
