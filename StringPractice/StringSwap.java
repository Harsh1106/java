public class StringSwap{
    public static boolean areAlmostEqual(String s1, String s2) {
        int i = 0, j = 0, count = 0;
        for(int k = 0 ; k < s1.length() ; k++){
            if(s1.charAt(k) != s2.charAt(k)){
                count++;
                if(count > 2) return false;
                else{
                    if(count == 1) i = k;
                    else j = k;
                }
            }
        }   
        return (s1.charAt(i) == s2.charAt(j) && s2.charAt(i) == s1.charAt(j));
    }
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}