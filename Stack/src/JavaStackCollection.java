import java.util.Stack;

public class JavaStackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        for (Integer ele : stack) {
            System.out.println(ele);
        }
        System.out.println("peek: " + stack.peek());
        System.out.println("capacity: " + stack.capacity());
        System.out.println("size: " + stack.size());
        System.out.println("firstElement: " + stack.firstElement());
    }
}