// this can be used to pass an argument in the constructor call.
class Test
{
    Test(this5 td)
    {
        System.out.println("In test class constructor");
    }
}
class this5
{
    void m1()
    {
        Test t = new Test(this);
    }
    public static void main(String[] args) {
        this5 t = new this5();
        t.m1();
    }
}