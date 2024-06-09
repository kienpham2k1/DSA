import ArrayStack.Stack;
public class ArrayStackTest {
    public static void main(String[] args) throws Exception {
        Stack fixStack = new Stack();
        fixStack.push(1);
        fixStack.push(2);
        fixStack.push(3);
        fixStack.push(4);
        fixStack.push(5);
        fixStack.display();
        fixStack.pop();
        fixStack.display();
        System.out.println(fixStack.peek());
    }
}
