// TC: O(N)
// SC: O(1)

import java.util.*;
public class validParenthesis {
    public static boolean isValid(String str){
        char ch[] = str.toCharArray();
        Stack<Character> obj = new Stack<>();
        for(char ele : ch){
            // if the element contains open bracket push it into stack
            if(ele == '(' || ele == '{' || ele == '['){
                obj.push(ele);
                continue;
            }
            else if(obj.empty()){
                return false;
            }

            char top = obj.pop();
            if(top == '(' && ele != ')'){
                return false;
            }
            else if(top == '[' && ele != ']'){
                return false;
            }
            else if(top == '{' && ele != '}'){
                return false;
            }
        }
        // is the stack is empty or not
        return(obj.empty() == true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for checking valid parenthesis: ");
        String str = sc.nextLine();
        System.out.println("Is the given string is valid or not? "+isValid(str));
    }
}
