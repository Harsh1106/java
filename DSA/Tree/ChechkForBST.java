public class ChechkForBST {
    public static boolean isBST(Node root, int min, int max){
        if(root == null) return true;
        if(root.data >= max || root.data <= min) return false;
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
    public static boolean isBST(Node root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);
        System.out.println(isBST(root));
    }
}
