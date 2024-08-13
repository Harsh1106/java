import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        // ArrayList al = new ArrayList();
        // al.add(10);
        // al.add(20);
        // al.add(30);
        // al.add(40);
        // System.out.println(al);


        // loops r should not be used to fetch the data from collection bcoz if someone is try to modifying the data while loop then it will not consider and it will stuck in infinite loop
        // for loop
        // this type of fetching can only be used where index wise accessing is applicable
        // for(int i = 0 ; i < al.size() ; i++){

        //     System.out.print(al.get(i)+" ");

        //     // Object o = al.get(i);

        //     // Object-> Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
        //     // System.out.println(o);

        // }

        // // for each loop
        // for(Object o : al){
        //     System.out.println(o);
        // }

        // to fetch the data use cursor/iterator
        // Iterator itr = al.iterator();
        // while(itr.hasNext()){
        //     itr.next();
        // }

        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Iterator<String> fe = fruits.iterator();
        // while(fe.hasNext()){
        //     System.out.println(fe.next());
        // }

        List<String> smallList = fruits.subList(0, 2);
        System.out.println(smallList);
    }
}
