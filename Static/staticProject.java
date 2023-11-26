import java.util.Scanner;


class Project {        
    int pa;
    float td,si;
    static float ri;

    static
    {
        ri = 8.5f;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please mention the amount required: ");
        pa = sc.nextInt();
        System.out.println("Please mention the time duration:");
        td = sc.nextFloat();
    }

    void compute()
    {
        si = (pa*ri*td)/100f;
    }

    void disp()
    {
        System.out.println("The amounnt of simple interest is: "+si);
    }
}

public class staticProject
{
    public static void main(String[] args) {
        Project p = new Project();
        p.input();  
        p.compute();
        p.disp();
        Project p1 = new Project();
        p1.input();  
        p1.compute();
        p1.disp();
    }
}
