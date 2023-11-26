
// The throw keyword in Java is used to explicitly throw an exception. When an exception is thrown using throw, it interrupts the normal flow of the program and transfers the control to the nearest enclosing try block.
// inshort smjha jaye to throw ka use bs itna hai ki hme apne se koi exception throw krna h to hm iska use kr skte hai.

public class ThrowPractice {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try{
            if(num2 < 0){
                Exception e = new ArithmeticException("Negative number"); //can write only Exception to instead of ArithmeticException().
// if we go to ArithmeticException library there is two constructor one which excepts strings and another one which doesnt accept anything so this string which we have provided will go to that constructor.                
                throw e;
            }
            else{
                int res = num1 / num2;
                System.out.println(res);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
