class Student{
    private String name;
    private int age;
    Student()
    {
        this("Rohit",19);
        System.out.println("Default constructor");
        name = "Harsh";
        age = 21;
    }
    Student(String name)
    {
        this();
        System.out.println("Single parameterized constrcuto");
        this.name = name;
        age = 21;
    }
    Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
        System.out.println("Double parameterized constructor");
    }
    void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.disp();

        Student s2 = new Student("Harsh", 22);
        s2.disp();
    }
}
