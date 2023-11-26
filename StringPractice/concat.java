class concat
{
    public static void main(String[] args) {
        // String s1 = new String("Harsh");
        // String s1 = "Harsh";
        // s1 = s1.concat(" Raj"); 
        // System.out.println(s1);

        // String s1 = "pwjava";
        // String s2 = s1.concat("Skill");
        // String s3 = new String("pw java");
        // s3 = s3.concat("skill");
        // System.out.println(s1);
        // System.out.println(s2); // now the memory of s2 will be get allocated outside the scp bcoz of the concat method(means that using inbuilt function or ref variable will help to allocate the memory outside the scp) but still a copy of its will be alloted in scp.
        // System.out.println(s3);


        // String s1 = "Harsh";
        // String s2 = "Harsh" + "Raj";
        // String s3 = "Harsh" + "Raj" + "Sinha";
        // String s4 = s1 + s2;
        // s1,s2 and s3 will get memory inside the scp but s4 will get memory outside the scp bcoz for concatination we used the reference variable but still the copy of it will be stored inside the scp which is not referred by any refernce variable
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);

        String s1 = "PW";
        System.out.println(s1);
        String str = "PW" + 100 + 99;
        System.out.println(str); //-----> PW10099
    }
}