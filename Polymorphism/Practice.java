package Polymorphism;

class A{
    static void m1(){
        System.out.println("Static method M1-A from class A");
    }
}
class B extends A{
    static void m1(){
        System.out.println("Static method M1-b from class B");
    }
}
public class Practice {
    public static void main(String[] args) {
        A obj = new B();    //Reference of type A, object of type B
        obj.m1();   // Calls static method from class A
    }
}