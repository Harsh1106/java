/*
->Checked Exceptions:
    Checked exceptions extend the java.lang.Exception class (or any of its subclasses except RuntimeException and its subclasses).
    They must be either caught (handled) using a try-catch block or declared using the throws keyword in the method signature.
    The purpose of checked exceptions is to enforce proper error handling by the programmer.
->Unchecked Exceptions (RuntimeExceptions):
    Unchecked exceptions extend the java.lang.RuntimeException class (or its subclasses).
    They do not need to be caught or declared explicitly using throws.
    Unchecked exceptions are typically caused by programming errors (e.g., null pointer access, array index out of bounds), and they are not checked at compile time.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class checkedunchecked {
    public static void main(String[] args) {
        int r = 7/0;   // an example of unchecked exception

        
        // an example of checked exception
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
