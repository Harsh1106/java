// the try & catch block is used for exception handling, allowing you to gracefully handle exceptions that might occur during the execution of your code. 

public class tryandcatch {
    public static void main(String[] args) {
        int num = 6;
        int num1 = 0;
        int res = 0;

        try{
            res = num / num1;
            // if there is an exception in this line then further line wont be execute.
            System.out.println("Inside the try block"); 
        }
        catch(Exception e) //as we know Exception is a class so it will have an object which will recieve the exception thrown by the try block.
        {
            System.out.println("Something went wrong.. "+e);
        }
        System.out.println(res);
        System.out.println("bye");
    }

}
