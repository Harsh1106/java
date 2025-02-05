class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class MirrorTree {
    static void mirror(Node node){
        solve(node);
    }
    static Node solve(Node node){
        if(node == null) return null;
        Node leftMirrored = solve(node.left);
        Node rightMirrored = solve(node.right);
        node.left = rightMirrored;
        node.right = leftMirrored;
        return node;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);   
        root.right.left = new Node(4);
        mirror(root);
        printTree(root);
    }
    public static void printTree(Node root, String indent, boolean last) {
        if (root != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "     ";
            } else {
                System.out.print("L----");
                indent += "|    ";
            }
    
            System.out.println(root.data);
            printTree(root.left, indent, false);
            printTree(root.right, indent, true);
        }
    }
    
    public static void printTree(Node root) {
        printTree(root, "", true);
    }
}
