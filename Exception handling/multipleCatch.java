/*
    printStackTrace():-  the printStackTrace() method is a part of the Throwable class, and it's used to print the stack trace of an exception. The stack trace provides information about the call hierarchy or sequence of method calls that led to the point where the exception was thrown.
    When an exception occurs and the catch block is executed, you can call e.printStackTrace() to print the stack trace to the standard error stream. This can be helpful for debugging and understanding the cause of the exception.
 */


class multipleCatch{
    public static void main(String[] args) {
        // we can't take exception from parent to child if we do so then we will get an error:- "ArithmeticException has already been caught" or "CompileTimeError".
        // try{
        //     System.out.println(10/0);
        // }catch(Exception e){
        //     e.printStackTrace();;
        // }catch(ArithmeticException ae){
        //     ae.printStackTrace();   //ArithmeticException has already been caught
        // }

        //order from child to parent:
        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}