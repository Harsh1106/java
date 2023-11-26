import java.util.ArrayList;
import java.util.List;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);

        System.out.println(al.contains(100)); //will return boolean value

        System.out.println(al.indexOf(300)); //will return the index of the object

        System.out.println(al.get(2)); //will return the value at particular index

        System.out.println(al.isEmpty()); //will return boolean value after traversing the objects


        System.out.println(al.size()); //will return the number of data has entered
        
        al.ensureCapacity(10); //ensure that it has this much capacity atleast we can add more if we want to add it does not meant that we can add this much data only we can add data as much as we want bcoz it is dynamically in nature

        al.trimToSize();
        System.out.println(al.size());

        al.clear(); // it will clear all the data inside the list

        System.out.println(al);


        List la = new ArrayList();
        la.add(100);
        System.out.println(la);
    }
}
