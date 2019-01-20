package pdsa.stack;

public interface Stackable {
    void push(int data);
    int pop() throws Exception;
    int peek() throws Exception;
    void empty();
}