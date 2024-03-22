import java.util.*;

abstract class Shape{
    abstract double area();
    abstract double peri();

    void display(){
        System.out.println("In shape!");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }

    double peri(){
        return 2*Math.PI*radius;
    }
}

class Square extends Shape{
    double side;

    Square(double side){
        this.side = side;
    }

    double area(){
        return side*side;
    }

    double peri(){
        return 4*side;
    }
}

class Rectangle extends Shape{
    double len,breadth;

    Rectangle(double len, double breadth){
        this.len = len;
        this.breadth = breadth;
    }

    double area(){
        return len*breadth;
    }

    double peri(){
        return 2*(len + breadth);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle cir = new Circle(10);
        double area = cir.area();
        double peri = cir.peri();
        System.out.printf("Area of circle: %.2f\n",area);
        System.out.printf("Perimeter of circle: %.2f\n",peri);
        cir.display();

        SquareRoot squ = new SquareRoot(10);
        System.out.println("Area of Square: "+squ.area());
        System.out.println("Perimeter of Square: "+squ.peri());
        squ.display();

        Rectangle rect = new Rectangle(10,20);
        System.out.println("Area of Rectangle: "+rect.area());
        System.out.println("Perimeter of Rectangle: "+rect.peri());
        rect.display();
    }
}
