public class equals {
    public static void main(String[] args) {
        // String s1 = "Harsh";
        // String s2 = new String("Harsh");
        // System.out.println(s1 == s2);
         // -----> false
         // "==" compares the reference of the object.


        // System.out.println(s1.equals(s2)); 
        // -----> true
        // ".equals()" compares the content of the object.

        String s1 = "Harsh";
        String s2 = new String("Harsh");
        String s3 = new String("HArsh");
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3); //false
        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equalsIgnoreCase(s3)); //true
        System.out.println(s1.equalsIgnoreCase(s3)); //true
    }
}