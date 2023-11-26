import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> ls = new ArrayList<String>();
        for(int i = 0 ; i < s.length()-k+1 ; i++){
            String sub = s.substring(i, i+k);
            ls.add(sub);
        }
        Collections.sort(ls);
        String smallest = ls.get(0);
        String largest = ls.get(s.length()-k);
        System.out.println(smallest);
        System.out.println(largest);
    }
}


