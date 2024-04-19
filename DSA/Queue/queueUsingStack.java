// Implementation of Queue Data Structure using Stack
// TC of enQueue: O(1)
// TC of deQueue: O(n)
// SC: O(n)
import java.util.*;
public class queueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // for inserting data in queue
    // tc:O(1) for this task
    static void enQueue(int data){
        stack1.push(data);
    }

    // deletion of the data from the queue
    // tc: O(n)
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        // will push all elements from stack1 to stack2
        if(stack2.empty()){
            while(!stack1.empty()){
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        // pop the top element from the top of the stack
        ele = stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        queueUsingStack obj = new queueUsingStack();
        // function calling for insertion of an element in queue
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);

        // function calling for deletion of an element from queue
        int result = obj.deQueue();
        System.out.println("Deleted element is: "+result);

        System.out.println("Again deleting: "+obj.deQueue());
    }
}
