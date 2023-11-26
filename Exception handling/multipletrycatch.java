//  there are 3 types of exception generally and their hierarchy is like this:
// Exception ----> RunTimeException ----> ArithmeticException ----> ArrayIndexOutOfBoundException ----> ClassCastException

public class multipletrycatch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int res = 0;
        int values[] = {4,7,2,9};
        String name = null;


        try{
            res = num1 / num2; //arithmetic exception exmaple+
            System.out.println(values[5]); //arrayboundoutofboundexception
            res = num1 / name.length(); //other exceptions
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of limits"+e);
        }
        catch(Exception e){
            System.out.println("cannont divide by zero"+e);
        }
        System.out.println(res);
        System.out.println("bye");
    }
}
