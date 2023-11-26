import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // it can also store heterogeneous types of data
        // internally it follows doubly linked list structure to store the data
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);

// can add duplicate object

        LinkedList ll1 = new LinkedList();
        ll1.add(150);
        ll1.add(250);
        ll1.add(350); //will add object sequentially
        System.out.println(ll1);

        ll1.addFirst("Harsh"); //will add object in first 
        System.out.println(ll1);

        ll1.addLast("Raj"); //will add object in last
        System.out.println(ll1);

        ll1.add(2, 975); //will add object at specific location
        System.out.println(ll1);

        System.out.println(ll1.peek()); //will return the first object
        System.out.println(ll1.peekLast()); //will return the last object

        System.out.println(ll1.peekFirst());


        System.out.println(ll1.poll()); //will also return the first object but it will also remove the first object 
        System.out.println(ll1);

        LinkedList l=new LinkedList();
        l.add('a');
        l.add(10);
        l.add('z');
        l.add(2,'a');
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
    }
}
// in linked list it's not like that in arraylist if we are storing the data at particular location then it will shift the other data to their next block but in case of linked list it won't shift any data it will just change the address from node.
