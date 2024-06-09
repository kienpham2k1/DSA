import LinkedListStack.Stack;

public class DynamicStackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
