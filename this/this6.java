// this can be used to return the current class instance from the method.

public class this6 {
    this6 m1()
    {
        return this;
    }
    public static void main(String[] args) {
        this6 t = new this6();
        t.m1();
    }
}
