public class wordLength {
    public static int lengthOfLastWord(String str){
        int count = 0;
        boolean found = false;
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            if(str.charAt(i) != ' '){
                count++;
                found = true;
            }
            else if(found)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int len = lengthOfLastWord(str);
        System.out.println("Length of last word is: "+len);
    }
}
