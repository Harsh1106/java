import java.util.*;
public class noFollowingPattern {
    static String printMinNumberForPattern(String str){
        StringBuilder res = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            st.push(i+1);
            if(i == str.length() || str.charAt(i) == 'I'){
                while(!st.empty()){
                    res.append(st.pop());
                }
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "IIDDD";
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i <= str.length() ; i++){
            st.push(i+1);
            if(i == str.length()  || str.charAt(i) == 'I'){//str.charAt(i) == 'I' || i == str.length() agr ye likh denge to wo string out of bound ka exception aa jaega
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
            }
        }
        // System.out.println(printMinNumberForPattern(str));
    }
}
