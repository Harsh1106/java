public class reverseLL{
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

    // revserse through iterative approach
    // public void rev(){
    //     Node curr = head;
    //     Node prev = null;
    //     Node nextPtr = null;
    //     while(curr != null){
    //         nextPtr = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = nextPtr; 
    //     }

    //     head = prev;
    //     return;
    // }

    // reversal through recursion
    public void reverseRec(Node curr, Node prev){
        //last node of a LL
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        } 
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRec(nextPtr, curr);
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        reverseLL obj = new reverseLL();
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.insertion(6);
        System.out.println("After reversing:");
        // obj.rev();
        obj.reverseRec(obj.head, null);
        obj.print();
    }
}
