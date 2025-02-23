public class PercentageofLetterinString {
    public static int percentageLetter(String s, char letter) {
        int count = 0, len = s.length();
        for(char ch : s.toCharArray()){
            if(ch == letter) count++;
        }
        float ans = (count * 100 / len);
        return (int)ans;
    }
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s, letter));
    }
}
