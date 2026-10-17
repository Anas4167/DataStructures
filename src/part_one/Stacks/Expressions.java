
package part_one.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expressions {


//    public boolean isBalanced(String input) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : input.toCharArray()) {
//
//            if (ch == '(' || ch == '<' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            }
//
//            if (ch == ')' || ch == '>' || ch == ']' || ch == '}') {
//
//                if (stack.empty())
//                    return false;
//
//                var top = stack.pop();
//
//                if ((ch == ')' && top != '(') ||
//                        (ch == '>' && top != '<') ||
//                        (ch == ']' && top != '[') ||
//                        (ch == '}' && top != '{')) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.empty();
//    }


    //make beautifull this code
//    public boolean isBalanced(String input) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : input.toCharArray()) {
//
//            if (isLeftBracket(ch)) {
//                stack.push(ch);
//            }
//
//            if (isRightBracket(ch)) {
//
//                if (stack.empty())
//                    return false;
//
//                var top = stack.pop();
//
//                if (!bracketsMatch(top, ch)) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.empty();
//    }
//
//    private boolean isLeftBracket(char ch){
//        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
//    }
//    private boolean isRightBracket(char ch){
//        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
//    }
//    private boolean bracketsMatch(char right, char left){
//        return (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{');
//    }

    //make more beautifull this code
    private final List<Character> leftBrackets = Arrays.asList('(' , '<' , '[' , '{');
    private final List<Character> rightBrackets = Arrays.asList( ')' , '>' , ']' , '}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {

            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            if (isRightBracket(ch)) {

                if (stack.empty())
                    return false;

                var top = stack.pop();

                if (!bracketsMatch(top, ch)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean bracketsMatch(char right, char left){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
