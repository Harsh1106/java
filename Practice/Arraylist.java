// Q.1 Create an ArrayList of integers and add the numbers 1 to 5 to the list. Print the elements.
/*Q.2 Create an ArrayList without specifying the initial capacity. Add 10 elements to the list. Print the size and capacity of the list. Add 5 more elements and print the updated size and capacity. Observe how the capacity changes.
*/
import java.lang.reflect.Field;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int capacity = getArrayListCapacity(al);
        System.out.println("Initial Capacity: "+capacity);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        System.out.println("Initial Capacity: "+capacity);
    }

    private static int getArrayListCapacity(ArrayList al) {
        try{
            Field  field = ArrayList.class.getDeclaredField("elementData");
            Object[] elementData = (Object[]) field.get(list);
        }
        return 0;
    }
}
