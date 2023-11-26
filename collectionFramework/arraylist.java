// array list implementing list interface nd it resides inside the util package.    
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100); //it will get stored as an object
        al.add(200);
        al.add(300); //it stores data dynamically we didn't need to specify the space 
        // duplicates values are allowed here
        System.out.println(al);

        System.out.println("**********************");

        // it can store heterogeneous types of data
        ArrayList al1 = new ArrayList();
        al1.add("Harsh");
        al1.add(1);
        al1.add('h');
        al1.add(1.1);
        System.out.println(al1);
        al1.add(100);
        System.out.println(al1);

        System.out.println("**************************");

        // we can add one collection into another collection
        System.out.println("After adding collection");
        al1.addAll(al);
        System.out.println(al1);


        // we can add data at any specific location nd specific data
        al1.add(2, "Shobhit"); 
        // we can use this but it is not preferable to use because it is not an efficient process and if we want to do this then we have to use linked list

        System.out.println(al1);

    }   
}
