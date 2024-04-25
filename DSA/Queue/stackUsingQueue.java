// Implementation of stack using the queue ds.
// Time complexity of add: O(n)
// Time complexity of remove: O(1)
// Space complexity: O(n)

import java.util.*;
class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // to add a new element in the stack
    // TC: O(n)
    static void add(int data){
        // move all the elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        // push the new data to q1
        q1.add(data);

        // move back all the elements from q2 to q1

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // to delete the element from stack
    // time complexity: O(1)
    static int remove(){
        int ele;
        while(q1.isEmpty()){
            System.out.println("Stack underflow");
            System.exit(0);
        }
        ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stackUsingQueue obj = new stackUsingQueue();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        
        System.out.println(obj.remove());
        System.out.println(obj.remove());
    }
}