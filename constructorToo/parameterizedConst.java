//Constructor is use to initialize an object.
//It does not have any return type.


public class parameterizedConst {
    String name;
    int emp_id;
    parameterizedConst(String name, int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }
    public static void main(String[] args) {
        parameterizedConst c = new parameterizedConst("Harsh Raj", 101);
        System.out.println(c.name + "  " + c.emp_id);
    }
}
