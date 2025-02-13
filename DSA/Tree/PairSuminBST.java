import java.util.ArrayList;

public class PairSuminBST {
    static void inorderTraversal(Node root, ArrayList<Integer> al){
        if(root == null) return;
        inorderTraversal(root.left, al);
        al.add(root.data);
        inorderTraversal(root.right, al);
    }
    static boolean findTarget(Node root, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        inorderTraversal(root, al);
        int left = 0, right = al.size() - 1;
        while(left < right){
            int sum = al.get(left) + al.get(right);
            if(sum == target) return true;
            if(sum < target) left++;
            else right--;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.right = new Node(9);
        int target = 12;
        System.out.println(findTarget(root, target));
    }
}
