package relativityQuiz;

import java.util.Stack;

public class StackkkkDemo {
    public static void main(String[] args) {
        char[] ch = new char[]{'a', 'c', 'b', 'b', 'c', 'j' };
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }
        System.out.println(stack.peek());


        String str = "<({})>";
        char[] character = str.toCharArray();
        Stack<Character> tima = new Stack<>();
        for (int i = 0; i < character.length; i++) {
            if (character.length % 2 == 1) {
                System.out.println(str + " is not balanced");
                break;
            } else {
                if (character[i] == '<' || character[i] == '(' || character[i] == '{')
                    tima.push(character[i]);

                if (character[i] == '>' || character[i] == ')' || character[i] == '}') {
                    if (tima.isEmpty()) {
                        System.out.println("Stack is empty, there are no open one's");
                    } else if (tima.peek() == '<' && character[i] == '>') {
                        tima.pop();
                    } else if (tima.peek() == '(' && character[i] == ')') {
                        tima.pop();
                    } else if (tima.peek() == '{' && character[i] == '}') {
                        tima.pop();
                    }
                }
            }
        }


    }
}
