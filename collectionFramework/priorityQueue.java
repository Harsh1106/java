import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
    // like ArrayList or LinkedList here we can't insert at any location or based on the index we can insert object only one after another 
    // not a heterogenous type
    // did'not maintain order
    // duplicate values are allowed
    // null values are also not allowed    
        pq.add(100);
        pq.add(50);
        pq.add(20);
        pq.add(300);
        pq.add(5);
        pq.add(125);
        pq.add(75);
        // pq.add("harsh");
        System.out.println(pq);

    }
}
