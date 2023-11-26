// it implements Sorted Set which extends the Set class 

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(110);
        ts.add(25);
        ts.add(75);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts); //order is stored.
        //it will give in the form of ascending order.
        //internally it follows binary search tree
        //treeset internally follows in-order traversal(LVR).
        // ts.add(100); 
        //duplicacy of data is not allowed
        // System.out.println(ts);
        // should not use null values.
        System.out.println(ts.higher(50)); //print the single data which is higher then inputted data
        System.out.println(ts.lower(50)); //print the single data which is lower then inputted data
        System.out.println(ts.ceiling(40));//to print the just above data
        System.out.println(ts.floor(40));//to print the just low data

//the main difference between higher and ceiling is that if we r using ceiling nd the inputted data is present then it will print the data but if the data is not present then it will print nearby data
        System.out.println(ts.ceiling(50)); 
        System.out.println(ts.floor(50));
    }
}
