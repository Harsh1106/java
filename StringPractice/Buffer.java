public class Buffer {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Harsh ");
        // System.out.println(sb);

        // // StringBuffer sb = ""; -----> INVALID SYNTAX

        // sb.append("Raj");
        // System.out.println(sb);

        // final String s = "Shobhit";
        // s = s.concat("Sinha");
        // System.out.println(s); ----->  cannot assign a value to final variable s

        // StringBuilder sb = new StringBuilder("Harsh ");
        // System.out.println(sb);

        // sb.append("Raj");
        // System.out.println(sb);

        // final StringBuilder sb = new StringBuilder("Harsh ");

        // StringBuffer sb = new StringBuffer("Harsh");    
        // System.out.println(sb.capacity());
        // System.out.println(sb);
        // sb.append(" Raj");
        // System.out.println(sb);
        // System.out.println(sb.charAt(1));
        // sb.setCharAt(1 , 'A');
        // System.out.println(sb); //HArsh Raj


        StringBuffer sb1 = new StringBuffer(150);
        System.out.println(sb1.capacity());
        sb1.append("Harsh");
        System.out.println(sb1.reverse());
        System.out.println(sb1);
        sb1.trimToSize();
        System.out.println(sb1.capacity());



        //the effect of final variable wont be on the string, it will affect the reference variable i.e. it cannot change it's address. It won't make mutable to immutable 
        // sb = new StringBuilder("Sinha");  -----> Cannot assign a value to final variable to sb
        // System.out.println(sb); -----> ERROR
    }
}
