/*Name of constructor should be as class name.
Object creation is not enough, compulsorily we should perform initialization then only the object is in a position to provide the response properly.
Whenever we are creating an object same piece of the code will be executed automatically to perform intialization of an object and allocate memory to instance variable.This piece of code is nothing but a constructor.
Main objective of the constructor is nothing but initialisation of Object.
Constructor does not have any return type.
If java doesn't have any parent class then by default it extends object class.
Super() is always added by the compiler in constructors body in first line.
If we want to use this() in first line then we have to write it forcefully otherwise compiler will add super keyword in the first line on its own.
And if we add this() method in first line then it won't add super() in first line.
*/
class Student
{
    private String name;
    private int age;
    Student(String name, int age)
    {
        // super();
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        Student s = new Student("Harsh",10);
        System.out.println(s.getName()+" "+s.getAge());
    }
}
