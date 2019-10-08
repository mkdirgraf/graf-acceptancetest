package RevisingJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] str = new String[]{"apple", "banana", "mango", "ciba"};
        //Arrays.sort(str);
        for (String st : str) {
            System.out.println(st);
        }

        String[] tima = str.clone();
        for (int i = 0; i < tima.length; i++) {
            System.out.println(tima[i]);
        }
        System.out.println("==========================");
        String[] graf = str;
        int d = 0;
        while (d < graf.length) {
            System.out.println(graf[d]);
            d++;
        }

        System.out.println("--------------------------------------");

        int[] arr = new int[]{2, 11, 1, 9, 111};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                break;
            }
            System.out.println(arr[i]);
        }
        System.out.println("=========================mama++++++++++==");
        List<String> list = Arrays.asList(str);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int m = 0;
        while (m < numbers.size()) {
            System.out.println(numbers.get(m));
            m++;
        }
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            num.add(arr[i]);
        }
        int order = 0;
        System.out.println(num.size());
        for (int j = 0; j < num.size(); j++) {
            System.out.println(num.get(j));
        }

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tima");
        listOfNames.add("Koch");
        listOfNames.add("Nunya");

        String[] convertNames=listOfNames.toArray(new String[0]);
        for (int i=0;i<convertNames.length;i++){
            Arrays.sort(convertNames);
            System.out.println(convertNames[i]);
        }


        String[] collectNames=new String[listOfNames.size()];
        for(int i=0;i<collectNames.length;i++){
            collectNames[i]=listOfNames.get(i);
        }
        System.out.println("===================");
        for(String nn:collectNames){
            System.out.println(nn);
        }
        if(Collections.binarySearch(listOfNames,"K") == -1){
            System.out.println("As expected the following element was not found");
        }else {
            System.out.println("following element is found at index : "+Collections.binarySearch(listOfNames,"K"));
        }

      //  System.out.println(Collections.binarySearch(listOfNames,"Nunya"));
    }

}
