class Human1
{
    private String name;
    int age;

    Human1() // 1st execution
    {
        // Constructor is not inherited in child class during inheritance. It get executed bcoz of child class as we know the java call automatically creates default constructor in its program so here when we created an obj of child class the defalut constructor also created but as we know in default constructor the first line is of super nd super always calls its parent class constructor. 
        System.out.println("Constructor inside the human1");
    }
    void sleep()
    {
        age = 18;
        System.out.println("Human needs a good sleep");
        System.out.println(age);
    }
    void heapsort(){
        
    }
}
class Student extends Human1{ 
    // void sleep() // 2nd execution
    // {
    //     System.out.println("Inside the child method."); 
    // }
    void disp() // 3rd execution
    {
        System.out.println("The age is: "+age);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Student  st = new Student();
        st.sleep();
        st.disp();
    }
}
