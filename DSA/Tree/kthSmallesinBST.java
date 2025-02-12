import java.util.ArrayList;

public class kthSmallesinBST {
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        if(k > 0 && k <= al.size())
            return al.get(k - 1);
        return -1;
    }
    public static void inorder(Node root, ArrayList<Integer> al){
        if(root == null) return;
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(1);
        node.right = new Node(3);
        int k = 2;
        System.out.println(kthSmallest(node, k));
    }   
}
