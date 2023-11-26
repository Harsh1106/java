 /*
 String builder is same as StringBuffer(1.0V) with few differences.
  1. No methods are synchronized.
  2. At a time more than one thread can operate so it is not a ThreadSafe.
  3. Threads are not required to wait so performance is high.
  4. Introduces in JDK 1.5 Version.
  */

/* 
 STRING: we opt if the content is fixed and it wont change frequently.
 
 StringBuffer: we opt if the content changes frequently but ThreadSafety is required.

 StringBuilder: we opt if the content changes frequently but ThreadSafety is not required.
 */


public class Builder {
    public static void main(String[] args) {
        // //capactiy = (oldCapacity + 1)*2
        // StringBuilder sb = new StringBuilder();
        // System.out.println(sb.capacity());

        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());

        // sb.append("qrst");
        // System.out.println(sb.capacity()); //how many chracters can you add
        // System.out.println(sb.length());//how many characters r present

        StringBuffer sb = new StringBuffer("Harsh");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
    }
}
