package relativityQuiz;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        String checkBalance = "<<({})>>";
        char[] ch = checkBalance.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '<' || ch[i] == '(' || ch[i] == '{')
                st.push(ch[i]);
        }
        System.out.println(st);


//            if (ch[i] == '>' || ch[i] == ')' || ch[i] == '}') {
//                if (st.pop() == '{' && ch[i]=='}') {
//                    st.pop();
//                    System.out.println(st);
//                }
//            }
//        }

//        if (st.isEmpty()) {
//            System.out.println("Balanced String");
//        } else {
//            System.out.println("Not balanced");
//        }
//
//        String s1 = "{";
//        String s2 = "}";
//        System.out.println(s1.equals(s2));




    }
}
