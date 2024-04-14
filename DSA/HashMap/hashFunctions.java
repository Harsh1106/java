import java.util.*;
class hashFunctions{
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        // functionality of put()
        hash.put(1, "Harsh");
        hash.put(3, "Raj");
        hash.put(5, " Panchii");
        hash.put(9, "Pari");

        // hashfunctions➡️ hf(v) = v % m;  
        // v ➡️ value, m ➡️ size of hashtable.

        System.out.println("HashMap of the given data set is:"+hash);

        // functionality of get()
        System.out.println(hash.get(3));

        //functionalities of containsKey()
        System.out.println(hash.containsKey(2));

        // functionalities of remove()
        hash.remove(1);
        System.out.println("Updated hashmap: "+hash);

        // iterating using for loop
        // Map.Entry having the key as Integer and value is String and then object e and uske andar hash.entrySet() daal diya
        for(Map.Entry<Integer, String> e : hash.entrySet()){
            System.out.println("HashMap is: "+e.getKey()+" : "+e.getValue());
        }
    }
}