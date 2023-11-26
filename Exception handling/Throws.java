// In this code it is noticable that there is an hierarchy.
// agar b() error handle ni kr skta to wo agar "throws Exception" likh deta h to wo exception uss method ko handle krna pdega jo usko call kiya hai.
// jaisa ki usse call a() n kra h pr agar a() bi handle na krna chahe to usme bi hmlg throws Exception likh kr wha bhej skte h jo usse call kr rha tha nd that will handle it.
// pr main function k aage throws Exception likhna isn't a good practice kyu ki main() ko jvm call krta hai and jvm exception ko handle ni krega.
// hme kahi na kahi to exception ko handle krna hga chahe wo jaha bi ho pr usko waise hi ni chor skte.
// and iss pure step ko mtlb error ko na solve krna usse ducking kehte hai.

class Demo{
    // public void a(){
    //     try{
    //         b();
    //     }
    //     catch(Exception e){
    //         System.out.println("error "+e.getMessage());
    //     }
        
    // }
    public void a() throws Exception{
        b();
    }
    public void b() throws Exception{
        int num1 = 8;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println(result);
    }
}

class Throws {
    public static void main(String[] args) {
       Demo obj = new Demo();
       try
       {
        obj.a(); 
       }
       catch(Exception e)
       {
        System.out.println("Error");
       }
    }
}