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
public class LevelOrderTraversal {
    public static boolean print(Node root, int level){
        if(root == null) return false;
        if(level == 1){
            System.out.print(root.val+" ");
            return true;
        }
        boolean left = print(root.left, level - 1);
        boolean right = print(root.right, level - 1);
        return (left || right);
    }
    public static void levelOrder(Node root){
        int level = 1;
        while(print(root, level)) level++;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root);  
    }
}
