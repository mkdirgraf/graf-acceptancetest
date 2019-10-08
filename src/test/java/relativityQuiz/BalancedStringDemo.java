package relativityQuiz;

import java.util.Stack;

/*
Stack<DataType> stack=new Stack(); -->Stack has only default no arg constructor
push(object)--->adds an element at the top of the Stack
pop()--->removes an element from from the top of the Stack
 */

public class BalancedStringDemo {
    public static void main(String[] args) {
        String str = "tima";
        Stack<Integer> stack = new Stack();
        System.out.println(stack.empty());
        System.out.println("pushing the stack");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.empty());
        for (int j = 0; j < 5; j++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }


        //checking push and pop
        Stack<String> tima = new Stack<>();
        tima.push("Bale");
        tima.push("Hazard");
        tima.push("Benzema");
        tima.push("Ramos");
        System.out.println(tima);

        System.out.println(tima.pop() + " removing last element");
        System.out.println(tima);
        for (int i = 0; i < tima.size(); i++) {
            if (tima.get(i).equals("Bale")) {
                tima.pop();
            }
        }
        System.out.println("after pop");
        System.out.println(tima);


        //-------------------------BALANCED STRING--------------------------------


    }
}
