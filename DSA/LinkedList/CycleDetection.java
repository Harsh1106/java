public class CycleDetection {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertion(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = new Node(value);
            return;
        }

        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // An implementation of famous Floyd's Cycle Detection Algorithm
    public void detect(){
        Node slow = head, fast = head;
        int flag = 0;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Loop exists!");
        }else{
            System.out.println("Loop doesn't exists!");
        }
    }
    public static void main(String[] args) {
        CycleDetection obj = new CycleDetection();
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.insertion(6);

        /* 
        to create circular linked list*/
        Node temp = obj.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = obj.head;
        
        obj.detect();
    }
}
