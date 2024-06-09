package IArray;

public interface IArray {
    public void insertAtStart(int data);

    public void insertAtEnd(int data);

    public void insertAtPosition(int data, int position);

    public void deleteAtStart();

    public void deleteAtEnd();

    public void deleteAtPosition(int position);

    public int findElement(int data);

    public void traversal();
}
