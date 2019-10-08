package RevisingJava;

public class StringClass {
    public static void main(String[] args) {
/*
String is immutable, once you initialize you can not change it, if you assign a new literal, then a new object will be created again
If you create a String without new keyword, then it will be saved in String constant pool, and whenever a new String will be created
with the same literal without new keyword, java will not create a new literal in string pool, it will point to the already existing in the string pool

Note: Whenever a new String object is created using new keyword, it will create a new object in Heap memory

Note: String constant pool is inside of Heap memory
Note: new keyword is memory wasting

 */
        String str = "Tima";
        String str2 = "Tima";
        String str3 = new String("Tima");
        String str4 = new String("Tima");
        String str5 = str3;
//        System.out.println(str5==str3);
//        System.out.println(str4==str5);
//        System.out.println(str==str3);
//        System.out.println(str==str2);
//        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str4);


        String change = "tima is sdet ";
        String[] arr = change.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr.length);
            System.out.println(arr[i]);
        }

        String c = change.trim();
        System.out.println(c);

        String sdet = change.substring(8, change.length() - 1);
        String name = "tima";
        System.out.println(name.substring(0, 2));
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("c"));
        System.out.println(name.substring(0, name.length() - 1));


        System.out.println(name.replace("a", "ka"));

        System.out.println(name.contains("a"));

        String d = "dimmma=%s";
        System.out.printf(String.format(d, "kk"));


        StringClass tima = new StringClass();
        StringClass tima2 = new StringClass();
        StringClass tima3 = tima;
        System.out.println();


        //Check if String is palindrome
        String car = "marat";
        String append = "";
        char[] ch = car.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            append += ch[i];
        }
        if (car.equals(append)){
            System.out.println("this word is palindrome");
        }else {
            System.out.println("This word is not palindrome");
        }

        StringBuilder sb=new StringBuilder("civic");
        String strversion=sb.toString();
        if(sb.reverse().equals(strversion)){
            System.out.println("this stringbuilder is palindrome");
        }else {
            System.out.println("This stringbuilder is not palindrome");
        }

char[] chhh={'r','o','s','e'};
       String babe=new String(chhh);
        System.out.println(babe);

String tf="tima";
String tggg="koch";
tf.concat(tggg);
        System.out.println(tf);


    }
}
