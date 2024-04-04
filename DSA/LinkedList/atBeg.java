public class atBeg {
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

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        atBeg obj = new atBeg();
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        System.out.println("Before the first node insertion the data are:");
        obj.print();
        System.out.println();
        System.out.println("After the insertion of first node:");
        obj.insertAtFirst(1);
        obj.print();
    }
}
