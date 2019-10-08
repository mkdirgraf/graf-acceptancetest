package RevisingJava.objectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectMapperDemo {
    public static void main(String[] args) throws IOException {
//        ObjectMapper obj = new ObjectMapper();
//        Car car = new Car();
//        car.setColor("brown");
//        car.setType("camry");
//        obj.writeValue(new File("target/car.json"), car);
//

        int[] arr = new int[]{2, 3, 1, 6, 4};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.forEach(e -> System.out.println(e));




        



    }

}
