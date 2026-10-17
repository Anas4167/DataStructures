package part_one.Stacks;

public class main {
    public static void main(String[] args) {
//        String str = "Anas";
//
//        StringReverser reverser = new StringReverser();
//
//        var result = reverser.reverse(str);
//
//        System.out.println(result);



//        String str = "(1 + 2 )>";
//        Expressions exp = new Expressions();
//        var result = exp.isBalanced(str);
//        System.out.println(result);


        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}