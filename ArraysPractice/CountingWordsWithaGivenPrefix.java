public class CountingWordsWithaGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].startsWith(pref)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String prefix = "at";
        System.out.println(prefixCount(words, prefix));
    }
}
