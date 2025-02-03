class Node{
    int data;
    Node left, right;
}
public class CountLeavesInBinaryTree {
    static int countLeaves(Node node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.left.data = 2;
        root.right = new Node();
        root.right.data = 3;
        root.left.left = new Node();
        root.left.left.data = 4;
        root.left.right = new Node();
        root.left.right.data = 5;
        root.right.left = new Node();
        root.right.left.data = 6;
        root.right.right = new Node();
        root.right.right.data = 7;
        System.out.println(countLeaves(root));
    }
}