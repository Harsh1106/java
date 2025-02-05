class Node{
    int val;
    Node right, left;
    Node(){}
    Node(int val){
        this.val = val;
        right = left = null;
    }
    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class MaximumDepthofBinaryTree {
    static int maxDepth(Node root){
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println(maxDepth(root));
    }
}
