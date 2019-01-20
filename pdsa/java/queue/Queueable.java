package pdsa.queue;

public interface Queueable {
    boolean add(int data);
    void remove();
    int poll() throws Exception;
    int peek() throws Exception;
}
