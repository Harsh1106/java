public class ValidParenthesis {

    public static void printBal(int n, int oc, int cc, String ans){
        if(oc == n && cc == n){
            System.out.println(ans);
            return;
        }
        // Number of recursive call = Number of fixed choices
        if(oc < n){
            printBal(n, oc + 1, cc, ans + "(");
        }
        if(oc > cc){
            printBal(n, oc, cc + 1, ans + ")");
        }   
    }

    public static void printPath(int curr, int dest, String path){
        if(curr > dest){
            return;
        }
        if(curr == dest){
            System.out.println(path);
            return;
        }
        printPath(curr + 1, dest, path + 1);
        printPath(curr + 2, dest, path + 2);
        printPath(curr + 3, dest, path + 3);
        printPath(curr + 4, dest, path + 4);
        printPath(curr + 5, dest, path + 5);
        printPath(curr + 6, dest, path + 6);
    }
    public static void main(String[] args) {
        // printBal(2, 0, 0, "");
        printPath(0, 9, "");
    }
}
