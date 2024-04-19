import java.util.*;
class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static void enQueue(int data){
        q1.add(data);
    }
    static int deQueue(){
        int ele;
        while(q1.isEmpty() && q2.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(q2.isEmpty()){
            while(!q1.isEmpty()){
                ele = q1.remove();
                q2.add(ele);
            }
        }
        ele = q2.remove();
        return ele;
    }
    public static void main(String[] args) {
        stackUsingQueue obj = new stackUsingQueue();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
    }
}