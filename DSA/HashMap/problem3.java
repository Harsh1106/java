/*
 Problem Statement: Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 Each letter in magazine can only be used once in ransomNote.

 Input: ransomNote = "a", magazine = "b" Output: false
 Input: ransomNote = "aa", magazine = "ab" Output: false
 Input: ransomNote = "aa", magazine = "aab" Output: true
 */


// TC: O(n + m) 
// SC: O(n + m)
// n -> length of ransomnote, m -> length of magazine
import java.util.*;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransomNote string:");
        String ransomNote = sc.nextLine();
        System.out.println("Enter the magazine string: ");
        String magazine = sc.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1); //map1.get() will return the index.
            }
            else{
                map1.put(c, 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++){
            char c = magazine.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c, map2.get(c) + 1);
            }
            else{
                map2.put(c, 1);
            }
        }

        boolean ans = true;
        for(Map.Entry<Character, Integer> e : map1.entrySet()){
            if(!map2.containsKey(e.getKey()) || e.getValue() > map2.get(e.getKey())){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
