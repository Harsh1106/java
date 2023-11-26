//  Types of inheritance in java: 
/*
1. Single level inheritance

    class A ------------>  class B

2. Multi level inheritance

    class A ------> class B ------> class C

3. Hierarchical inheritance
 
    class B <----- class A -----> class C   (One parent multiple child) 

4. Multple inheritance

    // and it leads to create a diamond shape problem
    class A -----> class C <------ class B  (two distinct parents one child which is not supported by java bcoz it makes compiler ambiguous so that's why it is applicable using interface)

*/

//  by default parent class inherit "object class"(parent class of all classes) which is a inbuilt class in java library


class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off!");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying!");
    }
}

class CargoPlane extends Aeroplane
{
    public void fly() //overriden method
    {
        System.out.println("Cargoplane flies at lower height");
    }
    public void carryGoods() //specialized method
    {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    // public void takeOff()
    // {
        // won't print anything 
    // }
}


public class Inheritance3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        // cp.takeOff();
        // cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        // pp.fly();
    }   
}
