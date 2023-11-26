// package constructor.java;

public class defaultConst {
    int i;
    String s;
    public static void main(String[] args){
        defaultConst d = new defaultConst();
        System.out.println(d.i + " " + d.s); //0 --> bcoz compiler attach default constructor by its own
    }
}
