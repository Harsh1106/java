import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashSet{
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        // introduced in java 1.2 with collection
// in this we cannot add data at any specific location
// index base accessing is not allowed here
// duplicates are not allowed  
// insertion order is not followed
// hashset is good for searching bco it follows hashing
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);

// hashset is parent class of linkedhashset
//linkedhash set follows hash table as well as linked list
// to gain the order of insertion we can use linkedhashset
// it was released in java 1.4

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);


    }
}