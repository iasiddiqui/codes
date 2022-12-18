
import java.util.*;

public class LLStack {

    class Node {
        public int data;
        public Node next;
    }

    private Node first;

    public LLStack() {
        first = null;
    }

    public void push(int x) {
        Node n = new Node();
        n.data = x;
        n.next = first;
        first = n;
    }

    public int peek() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            int ret = first.data;
            return ret;
        }
    }

    public int pop() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            Node temp = first;
            first = first.next;
            return temp.data;
        }
    }

    public static void main(String[] args) {
        System.out.print("\nthis is ISHAN\n");

        LLStack list = new LLStack();
        list.push(1);
        list.push(2);
        list.push(3);

        System.out.print("First peek : " + list.peek());
        System.out.print("\nFirst pop: " + list.pop() + "\nSecond pop: " + list.pop() + "\nThird pop: " + list.pop());
        System.out.print("\n");
    }
}
