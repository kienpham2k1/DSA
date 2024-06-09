import OneDimensionArray.Array;

public class App {
    public static void main(String[] args) throws Exception {
        Array arr = new Array();
        arr.insertAtStart(3);
        arr.insertAtStart(1);
        arr.insertAtStart(2);
        arr.insertAtStart(4);
        arr.insertAtStart(5);
        arr.insertAtStart(5);

        arr.deleteAtStart();
        arr.deleteAtStart();

        arr.insertAtEnd(12);
        arr.traversal();
        arr.insertAtPosition(7, 3);
        arr.traversal();
        arr.deleteAtPosition(3);
        arr.traversal();
        // System.out.printf("find x = 12, rs: %d", arr.findElement(12));
    }
}
