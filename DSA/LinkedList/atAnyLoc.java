public class atAnyLoc {
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

    // public void insertionAtLoc(int data, int after){
    //     Node newNode = new Node(data);
    //     Node temp = head;
    //     while(temp.next != null){
    //         if(temp.data == after){
    //             newNode.next = temp.next;
    //             temp.next = newNode;
    //         }
    //         temp = temp.next;
    //     }
    // }
    public void insertionAtLoc(Node preNode, int data){
        if(preNode == null){
            System.out.println("The previous node shouldn't contain null values.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        atAnyLoc obj = new atAnyLoc();
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(4);
        obj.insertion(5);
        System.out.println("Before inserting the value at any location:");
        obj.print();
        System.out.println();
        System.out.println("After insertion at specific location:");
        obj.insertionAtLoc(obj.head.next, 3);
        obj.print();
    }
}
