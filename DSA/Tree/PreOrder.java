import java.util.List;
import java.util.ArrayList;

class Node{
    int val;
    Node left, right;
    Node(){}
    Node(int val){
        this.val = val;
    }   
    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class PreOrder {
    static List<Integer> result = new ArrayList<>();
    static List<Integer> preOrder(Node root) {
        if(root == null) return result;
        result.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;
        root.left = new Node();
        root.left.val = 2;
        root.right = new Node();
        root.right.val = 3;
        root.left.left = new Node();
        root.left.left.val = 4;
        root.left.right = new Node();
        root.left.right.val = 5;
        root.right.left = new Node();
        root.right.left.val = 6;
        root.right.right = new Node();
        root.right.right.val = 7;
        System.out.println(preOrder(root));
    }
}
