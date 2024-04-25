// Implement a map in java which takes the input and print the list sorted order based on the key.
// Input:  5 Rahul, 7 Lakshma, 1 Ram, 4 Krrish, 2 Lakshay
// Output: 1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=Lakshman
import java.util.*;
public class treeMap {
    public static void main(String[] args) {
//         TreeMap<Integer, String> map = new TreeMap<>();
//         map.put(5, "Rahul");
//         map.put(7, "Lakshman");
//         map.put(1, "Ram");
//         map.put(4, "Krrish");
//         map.put(2, "Lakshay");
//         System.out.println(map);    

// Q2. Implement a Map in java which takes the input and print the list in sorted order based on value.
// Input: 5— Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay
// Output: {Krish=4,Lakshay=2,Lakshman=7,Rahul=5,Ram=1}
           Scanner sc = new Scanner(System.in);
           TreeMap<String, Integer> map = new TreeMap<>();
           System.out.println("Enter the number of key-value pairs: ");
           int num = sc.nextInt();
           for(int i = 0 ; i < num ; i++){
                int key = sc.nextInt();
                String value = sc.next();
                map.put(value, key);
           }
           System.out.println(map);
    }
}
