package RevisingJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingListToArrayDemo {
    public static void main(String[] args) {

        int[] ar=new int[]{2,3,2,4,6};
        List<Integer> list= Arrays.stream(ar).boxed().collect(Collectors.toList());
        list.forEach(System.out::print);




    }
}
