package pdsa.stack;

public class StackConsumer {
    public static void main(String[] args) {

        System.out.println("Stack methods - push, pop, peek, empty\n");

        System.out.println("Create a stack");
        Stack stack = new Stack();

        print(stack);

        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        print(stack);

        System.out.println("Pop a value from stack");

        try {
            System.out.println("pop value: " + stack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        print(stack);

        System.out.println("Peek a value from stack");

        try {
            System.out.println("peek value: " + stack.peek());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        print(stack);

        System.out.println("Call stack empty");

        stack.empty();

        print(stack);
    }

    public static void print(Stack stack) {

        System.out.println("--- stack values ---");

        Node current = stack.getHead();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

        System.out.println("--------------------\n");
    }

}
