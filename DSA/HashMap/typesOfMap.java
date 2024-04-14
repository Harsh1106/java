import java.util.*;

public class typesOfMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Harsh");
        map.put(1, "Raj");
        map.put(7, "Pari");
        map.put(5, "Panchi");
        System.out.println("Hashmap looks like: "+map);  //{1=Raj, 3=Harsh, 5=Panchi, 7=Pari}--> order of insertion is not preserved.
        
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(3, "Harsh");
        map1.put(1, "Raj");
        map1.put(7, "Pari");
        map1.put(5, "Panchi");
        System.out.println("LinkedHashmap looks like: "+map1); //{3=Harsh, 1=Raj, 7=Pari, 5=Panchi}--> order of insertion is preserved. 
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "Harsh");
        map2.put(1, "Raj");
        map2.put(7, "Pari");
        map2.put(5, "Panchi");
        System.out.println("TreeMap looks like: "+map2); // {1=Raj, 3=Harsh, 5=Panchi, 7=Pari} --> values get sorted on the basis of keys

    
    }
}
