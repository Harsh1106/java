public class mutablestring {
    public static void main(String[] args) {
        String brand = "Harsh Raj"; //it's memory will be in the heap area inside of the scp area bcoz we haven't used the new keyword.
        System.out.println(brand);
        brand.concat("Patna");
        System.out.println(brand);// won't reflect any change. bcoz of its immutability.
        String s1 = new String("Pwskill"); // it's memory will be create outside the scp but inside the heap area bcoz of the use of new keyword and a jvm creates a copy of in scp which isnt referred by any object.

        StringBuilder brand1 = new StringBuilder("Harsh Raj");
        System.out.println(brand1);
        brand1.append(" Patna");
        System.out.println(brand1); //reflect changes bcoz of its mutability.
    }
}
