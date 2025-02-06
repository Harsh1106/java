import java.util.HashMap;
import java.util.Map;

public class ConstructTreefromInorderPreorder {
    public static Node buildTree(int inorder[], int preorder[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i], i);
        }
        Node root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
        return root;
    }
    public static Node build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;
        Node root = new Node(preorder[preStart]);
        int inRoot = map.get(root.data);
        int nums = inRoot - inStart;
        root.left = build(preorder, preStart + 1, preStart + nums, inorder, inStart, inRoot - 1, map);
        root.right = build(preorder, preStart + nums + 1, preEnd, inorder,  inRoot + 1, inEnd, map);
        return root;
    }
    public static void main(String[] args) {
        int[] inorder = {1,6,8,7};
        int[] preorder = {1,6,7,8};
        Node root = buildTree(inorder, preorder);
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
