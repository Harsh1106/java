// implementation of the queue function available in java

import java.util.*;
public class implementation{
    public static void main(String[] args) {
        // Queue can be implemented two ways:
        // 1. Linked List-> and internally it is using Doublel linked List 
        // 2. Priority Queue
        Queue<Integer> q = new LinkedList<>();

        // to add the data inside the queue
        for(int i = 0 ; i < 10 ; i++){
            q.add(i); //enqueue operation
        }

        System.out.println("Data of queue looks like:"+q);

        // to remove the data inside the queue
        q.remove(); //dequeue operation
        System.out.println("After deletion the queue looks like: "+q);


        //print the top most element of the queue
        System.out.println("Topmost element of the queue: "+q.peek());

        // print the length of the queue
        System.out.println("Length of the queue: "+q.size());

        
        // will return boolean value
        System.out.println("Is queue is empty or not: "+q.isEmpty());
    }
}