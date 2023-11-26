// import java.io.*;
// import java.util.*;

// class Practice {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String B=sc.next();
//         StringBuilder str = new StringBuilder();

//         int sum = A.length() + B.length();
//         int res = A.compareTo(B);
//         System.out.println(sum);
//         if(res < 0 || res == 0){
//             System.out.println("No");
//         }else{
//             System.out.println("Yes");
//         }
//         System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " ");
//         System.out.print(B.substring(0,1).toUpperCase() + B.substring(1));
//     }
// }
import java.io.*;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        for(int i = str.length() - k ; i < str.length() ; i++){
            System.out.print(str.charAt(i));
             
        }
        System.out.println();
        System.out.print(str.substring(0,k));
        
    }
}





