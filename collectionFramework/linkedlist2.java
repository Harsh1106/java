import java.util.LinkedList;
import java.util.List;
public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList  ll = new LinkedList();
        // as we know that LinkedList implements two classes one is List and another one is Dequeue so that's why we can give reference of Parent class.
        // List ll = new LinkedList();  
        // Deque dl = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);
// on using parent reference in object creation we can use inherited method overriden method but we can't access specialized method that's why we can't acces "peek()" "addFirst()" types method if we r giving referencing of parent "List".

//  so always give reference of "LinkedList" not "List" or "Deque".
        System.out.println(ll);


        System.out.println(ll.get(2)); //return the object at this index

        System.out.println(ll.getFirst()); //will return the first object
        
        System.out.println(ll.getLast()); //will return the last object

        System.out.println(ll.indexOf(300)); //will return the index of object
        System.out.println(ll.lastIndexOf(300));


        ll.push(400); //push the object at the begining
        System.out.println(ll);

       
        System.out.println(ll.pop()); //it will show me the last inserted element

        System.out.println(ll);

        // ll.addFirst(36); //add object at first
        // ll.addLast(96); //add object at last
        // System.out.println(ll);
        // System.out.println(ll.poll());
        // System.out.println(ll);
        // System.out.println(ll.pollFirst());
        // System.out.println(ll);
        // System.out.println(ll.pollLast());
        // System.out.println(ll);
    }
}
