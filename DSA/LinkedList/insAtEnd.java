class insAtEnd{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    // implementation of insertion of a node at the end
    public void insertAtLast(int value){
        Node newNode = new Node(value);

        // check if LL is empty 
        if(head == null){
            head = new Node(value);
            return;
        }

        newNode.next = null;
        Node temp =  head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        insAtEnd obj = new insAtEnd();
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        System.out.println("Original LL:");
        obj.print();
        System.out.println();
        System.out.println("After adding one more data in LL:");
        obj.insertAtLast(6);
        obj.print();
    }
}