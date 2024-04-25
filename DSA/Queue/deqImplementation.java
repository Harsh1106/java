import java.util.*;
public class deqImplementation {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.addLast(5);
        deq.addLast(7);
        deq.addLast(9);
        System.out.println(deq);

        deq.removeLast();
        System.out.println(deq); //implementation of stack

        deq.removeFirst();
        System.out.println(deq); //implementation of queue

    }
}