package RevisingJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> orderOfNames=new HashMap<>();
        String[] names=new String[]{"Mahendra","Arpan","Kumaresh","Temirlan"};
        int d=1;
        for (int i=0;i<names.length;i++){
            orderOfNames.put(d,names[i]);
            d++;
        }
        System.out.println(orderOfNames.get(1));
        System.out.println(orderOfNames.size());


        Map<String,String> lastNames=new HashMap<>();
        lastNames.put("Temirlan","Kochkorov");
        lastNames.put("Ilias","Kochkorov");
        lastNames.put("Beksultan","Kochkorov");
        lastNames.put("Eldiar","Kochkorov");
        lastNames.put("Eldiar","Sourbaev");
        System.out.println(lastNames.keySet());
        System.out.println(lastNames.values());
        System.out.println(lastNames.entrySet());
        for (Map.Entry<String,String> add:lastNames.entrySet()){
            System.out.println("Key "+add.getKey()+" and value: "+add.getValue());
        }

        System.out.println("===========");
        System.out.println(lastNames.entrySet());
        System.out.println(lastNames.size());
        System.out.println(lastNames.values());
        System.out.println(lastNames.keySet());

        System.out.println("===========================");
        int count=0;
        String last="Kochkorov";
        String eldiar="Sourbaev";
        for(Map.Entry<String,String> checkLastName:lastNames.entrySet()){
            if(checkLastName.getValue().equals(eldiar)){
                count++;
            }
        }
        System.out.println(count);




    }
}
