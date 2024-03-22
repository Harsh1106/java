// time complexity of linear search is O(n).
import java.util.Scanner;

public class linearSearch {
    public static int Search(int n[], int key){
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[] = {2,4,6,8,10,12,14,16,18,20};
        System.out.print("Enter the element you want to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = Search(n, key);
        if(index == -1){
            System.out.println("Element is not found in the list.");
        }else{
            System.out.println("Element is found at "+index+".");
        }
    }
}
