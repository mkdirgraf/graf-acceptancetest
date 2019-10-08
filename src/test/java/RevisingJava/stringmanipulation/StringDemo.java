package RevisingJava.stringmanipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringDemo {
    public static void main(String[] args) {
        //substring()-->inclusive and exlusive
        String str = "select from * tbf0_patient where pat_last_name='Diego' and pat_last_name='Costa' and pat_id='sdfsdfjlsd'";
        String finalQuery = str.substring(0, str.lastIndexOf("and")).concat(";");
        System.out.println(finalQuery);

        String[] listofAnds = str.split(" ");
        int count = 0;
        System.out.println(listofAnds.length + " is the length of the str");
        for (int i = 0; i < listofAnds.length; i++) {
            if (listofAnds[i].equals("and")) {
                ++count;
            }
        }
        System.out.println(count);


        String name = "chingizhan";
        char[] ch = name.toCharArray();
        Map<Character, Integer> countNumber = new LinkedHashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (countNumber.containsKey(ch[i])) {
                int numberOfChars = countNumber.get(ch[i]);
                countNumber.put(ch[i], ++numberOfChars);
            } else {
                countNumber.put(ch[i], 1);
            }
        }

        countNumber.forEach((k, v) -> System.out.print(k + ": " + v + ",  "));

    }
}
