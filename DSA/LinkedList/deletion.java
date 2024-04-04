public class deletion {
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

    public void deleteNode(int pos){
        // if LL is empty
        if(head == null){
            return;
        }

        Node temp = head;
        // if deletion is in the begining of the node
        if(pos == 0){
            head = temp.next;
            return;
        }

        // if deletion is not in the begining of the node
        for(int i = 0 ; temp != null && i < pos-1 ; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return; //means empty node is there
        }
        temp.next = temp.next.next;
        return;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        deletion obj = new deletion();
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        System.out.println("Value before deletion: ");
        obj.print();
        System.out.println("After deletion: ");
        obj.deleteNode(2);
        obj.print();
    }
}
