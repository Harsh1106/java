
//In Java, a custom exception is an exception class that you define yourself, extending from one of the existing exception classes provided by Java, such as Exception, RuntimeException, or any other subclass of Throwable. Creating custom exceptions allows you to represent application-specific error conditions and handle them in a structured manner.
class MyException extends Exception{
    //using this we can create a MyException class
    public MyException(){} // ---> it is just a default constructor

    public MyException(String msg){// it recieves msg nd jst same as ArithmeticException
        super(msg); //it will call the parent class constructor Exception.
    } 
}

public class CustomException {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try{
            if(num2 < 0){
                Exception e = new MyException("Negative Number"); 
                throw e;
            }
            else{
                int res = num1 / num2;
                System.out.println(res);
            }
        }catch(Exception e){
            System.out.println("Error: "+e); //Error: MyException
        }
    }
}
