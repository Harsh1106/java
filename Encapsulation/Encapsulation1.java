class Student
{
    private int age;
    private String name;
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.setAge(18);
        s.setName("Harsh");
        System.out.println(s.getAge()+" "+s.getName());
        s1.setAge(40);
        s1.setName("Raj");
        System.out.println(s1.getAge()+" "+s1.getName());
    }
}
