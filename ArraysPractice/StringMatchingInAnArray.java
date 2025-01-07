import java.util.ArrayList;
import java.util.List;
public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        List<String> al = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words.length ; j++){
                if(i != j && words[j].contains(words[i])){
                    al.add(words[i]);
                    break;
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
}
