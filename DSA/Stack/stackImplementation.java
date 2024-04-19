import java.util.*;
public class stackImplementation{
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        //push element inside the stack
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        // print the top most element in stack
        System.out.println("top most element of stack is: "+obj.peek());
        System.out.println(obj.search(4)); //2
        // delete the top most element of stack
        obj.pop();
        System.out.println("The top most element after deletion is: "+obj.peek());

        System.out.println("Element 4 is present at the position: "+obj.search(4)); //1

        // to check whether the stack is empty or not
        // returns boolean value
        System.out.println("Stack is empty or not: "+obj.empty());
    }
}