package RevisingJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {


    public static void fibonacciNumbers(int endNumber){
        int a,b=1,c=1;
        a=0;
        System.out.print("0 1 1 ");
        while (a<=endNumber){
            a=b+c;
            System.out.print(a+" ");
            b=c;
            c=a;
        }
    }


    public static void main(String[] args) {
fibonacciNumbers(50);

        System.out.println("=================");
//        String numbers = "12294";
//        int i = Integer.parseInt(numbers);
//        Integer wrapper = Integer.parseInt(numbers);

        System.out.println("=========");
        String bool = "true";
        boolean primitive = Boolean.parseBoolean(bool);
        System.out.println(primitive);
        Boolean wrapper2 = Boolean.parseBoolean(bool);
        System.out.println(wrapper2);


        //How to remove all the duplicate characters in String
        String name = "Ronaldo";
        char[] ch = new char[name.length()];
        OUTTER:
        for (int i = 0; i < name.length(); i++) {
            ch[i] = name.charAt(i);
            int found = 0;
            INNER:
            for (int j = 0; j <= i; j++) {
                if (name.charAt(i) == ch[j]) {
                    found++;
                }
            }
            System.out.println("number of occurences of " + name.charAt(i) + " is  " + found);
        }


        //How to check if String is palindrome

        String model = "civic";
        String newstring="";
        for (int i = model.length()-1; i >=0; i--) {
            newstring+=model.charAt(i);
        }
        if (newstring.equals(model)){
            System.out.println("This String is palindrome");
        }else if(!newstring.equals(model)) {
            System.out.println("Following String is not palindrome");
        }
        System.out.println(newstring);


        //How to get a fibonacci numbers



        String serviceName="google.apis.com?city=%s&state=%s";
        String updated=String.format(serviceName,"Chicago","Illinois");
        System.out.println(updated);




    }
}
