package RevisingJava.lambda;

import java.util.HashMap;
import java.util.Map;

interface A {
    public abstract void draw(int b);

}

public class LambdaDemo {
    public static void main(String[] args) {
        A a = (int j) -> System.out.println("This is a interface" + j);
        A b = (int l) -> System.out.println("This is b interface" + l);

        a.draw(3);
        b.draw(4);

        String str = "temirlanta";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int count = map.get(ch[i]);
                map.put(ch[i], ++count);
            } else {
                map.put(ch[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> data : map.entrySet()) {
            System.out.print("'" + data.getKey() + "': " + data.getValue() + " , ");
        }

        System.out.println(" ");
        //reverse an array
        int temp;
        int[] tk = new int[]{2, 1, 6, 3, 12, 9, 15};
        for (int i = 0; i < tk.length; i++) {
            for (int j = 0; j < tk.length; j++) {
                if (tk[j] > tk[i]) {
                    temp = tk[j];
                    tk[j] = tk[i];
                    tk[i] = temp;
                }
            }



        }
        for (int g=0;g<tk.length;g++){
            System.out.println(tk[g]+" ");
        }
    }

}
