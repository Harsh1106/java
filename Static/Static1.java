public class Static1
{
    static int age;
    /* You can access static methods from outside of the class in which they are defined This is not
       possible with non static methods.
     * Subclasses can override static methods but non static methods can't.
     * Static methods are executed when an instance of the class is executed whereas non static method 
       are not.
     * Static methods can be used to create utility classes that contain genral purpose methods.
     * A static method can't refer to "this" or "super" keyword.
     * Firstly the static variable gets executed then static block then static methods then non static variable
       and then non static methods.
     * Inside static block if variable is declare without the keyword static then it will be considered
       as instance variable and it's scope will be only inside the static block.
     */
    static
    {
        /*It get execute only when class gets loaded. */
        age = 10;
        int buy = 16; // instance variable
        int result = age + buy; // instance variable
        System.out.println(result);
        System.out.println(age);
    }

    /*here in the java program we have two static method which is main and run but in both of them
      firstly main one will get executed bcoz JVM will call him but if we want to execute run method
      first then we have to call it inside the main method.
     */

    static void run()
    {
        System.out.println("Inside the static method");
    }
    public static void main(String[] args) {
        run();
        System.out.println("Inside the main method!");
    }
}
