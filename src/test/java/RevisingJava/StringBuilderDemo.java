package RevisingJava;

public class StringBuilderDemo {
    public static void main(String[] args) {

        /**
         * StringBuilder is mutable, each time when the state is changed it doesn't create a new object like String, because it is mutable(changeable)
         * Note:  Chaining makes this even more interesting. When we chained String method calls, the
         * result was a new String with the answer. Chaining StringBuilder objects doesn’t work
         * this way. Instead, the StringBuilder changes its own state and returns a reference to itself!
         *
         * Note: Size is the number of characters currently in the sequence, and capacity is the number
         * of characters the sequence can currently hold. Since a String is immutable, the size and
         * capacity are the same. The number of characters appearing in the String is both the size
         * and capacity.
         * Note: if StringBuilder capacity is 5 and all the slots are empty then , size will be 0, length is number of slots occupied from capacity
         *
         *
         *
         */

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println(sb);
        StringBuilder stb = sb.append("+end");//This time the reference is
        //stored in same—which means sb and same point to the exact same object and would print
        StringBuilder stt=new StringBuilder("start+middle+end");
        System.out.println(stb);
        System.out.println(sb);

//        System.out.println(sb==stb);
        System.out.println(sb.equals(stb));
        System.out.println(sb.equals(stt));
//        System.out.println(sb==stt);

        System.out.println(sb.length());
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.charAt(4));
        System.out.println(sb.subSequence(0,3));

        System.out.println(sb.delete(0,2));
        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.insert(0,"s"));



    }
}
