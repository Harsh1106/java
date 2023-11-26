// It is one of the pillars of object orientation
// It always speaks about reusability.
// Using inheritance,productivity of the code can be improved.
// If we use inheritance, lines of code can be reduced in the application.
// In java inheritance is acheived through the "extends" keyword.
class Human{    //super class // base class // parent class
    int age;
    void sleep()
    {
        age = 18;
        System.out.println("Human needs a good sleep");
        System.out.println(age);
    }
}
// In java we achieve inheritance using extends keyword
class Student extends Human{ // derived class // child class // sub class
    void sleep()    //inherited method
    {
        System.out.println("Inside the child method."); //the child class will get print
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
    }
}