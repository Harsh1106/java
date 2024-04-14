// TC: O(N)
// SC: O(N)
import java.util.*;

public class nonRepeating{
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        // construction of hashmap
        // key - unique character
        // value - occurence of character 
        
        for(int i = 0 ; i < str.length() ; i++){
            if(map.containsKey(str.charAt(i))){
               map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        // Scanned the entire hash table and get the index of the non repeating character.
        int result = -1;
        for(int i = 0 ; i < str.length() ; i++){
            if(map.get(str.charAt(i)) == 1){
                result = 1;
                System.out.println("First non repeating character: "+i);
                break;
            }
        }
        if(result == -1){
            System.out.println("Non repeating character present in the string.");
        }        
    }
}