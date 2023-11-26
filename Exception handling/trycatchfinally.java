import java.util.InputMismatchException;
import java.util.Scanner;
// finally class will always execute irrespective of try  and catch 
// and most of the time we use finally block to close the resource like database connection, file open and close option or close an object of scanner class.
class trycatchfinally {
    public static void main(String[] args) {
        int num = 0;
        
        try(Scanner sc = new Scanner(System.in);)
        // to overcome the finally block in java, it introduces to close resource inside the try block itself and it is named as try with resources or you can say an upgraded version of finally block.
        // inside this the resource will close by itself, it doesn't depend upon that error comes or not it will close it automatically.
        {
            num = sc.nextInt();
            // sc.close(); if we choose to set a relation between environments then we must close them after using them but as we know if we get an error before this line then it will never close so to overcome that issue there is a finally block.
        }catch(InputMismatchException e){
            System.out.println("Enter a number please");
        }
        // finally{
        //     sc.close();
        //     System.out.println("Resource closed..");
        // }
        System.out.println(num);
    }
}
