interface computer{
    void compileCode();
}
class Laptop implements computer{
    public void compileCode(){
        System.out.println("You got errrors!");
    }
}
class Desktop implements computer{
    public void compileCode(){
        System.out.println("You got errors, faster!");
    }
}
class Developer{
    public void buildApp(computer obj){
        System.out.println("Building an app!");
        obj.compileCode();
    }
}

public class Interface2 {
    public static void main(String[] args) {
        //we always create reference of abstract class not the object.
        computer obj = new Desktop();
        
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
