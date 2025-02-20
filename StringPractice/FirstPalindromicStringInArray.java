public class FirstPalindromicStringInArray {
    public static String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPallindrome(word)) return word;
        }
        return "";
    }
    private static boolean isPallindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        String res = firstPalindrome(arr);
        System.out.println(res);
    }
}
