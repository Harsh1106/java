import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
// arraydeque internally follow double ended queue
// as we know we cannot insert data in between the queue we can insert only at first and last
// can add duplicate data here too
// can store homogeneous and heterogeneous types of data
        ad.add(100);
        ad.add(200);
        ad.add(300);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast(05);
        ad.add(10);
        System.out.println(ad);
        ad.add("Harsh");
        System.out.println(ad);
        
// offer can do insertion or cannot its upto the necessity of the object
        ad.offer(31); //will add object in order
        ad.offerFirst(11); //will add object at first
        ad.offerLast(21);   //will add object at last
        System.out.println(ad);
    }
}
