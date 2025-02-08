import java.util.ArrayList;

public class TreeBoundarTraversal {
    static boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    static void collectBL(Node root, ArrayList<Integer> res){
        if(root == null || isLeaf(root)) return;
        res.add(root.data);
        if(root.left != null) collectBL(root.left, res);
        else if(root.right != null) collectBL(root.right, res);
    }
    static void collectL(Node root, ArrayList<Integer> res){
        if(root == null) return;
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        collectL(root.left, res);
        collectL(root.right, res);
    }
    static void collectBR(Node root, ArrayList<Integer> res){
        if(root == null || isLeaf(root)) return;
        if(root.right != null) collectBR(root.right, res);
        else if(root.left != null) collectBR(root.left, res);
        res.add(root.data);
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;
        if(!isLeaf(root)) al.add(root.data);
        collectBL(root.left, al);
        collectL(root, al);
        collectBR(root.right, al);
        return al;
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        
        TreeBoundarTraversal obj = new TreeBoundarTraversal();
        ArrayList<Integer> res = obj.boundaryTraversal(root);
        for(int i : res) System.out.print(i + " ");
    }
}
