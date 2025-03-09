public class AlternatingGroups2 {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0, n = colors.length, left = 0;
        for(int i = 1 ; i < (n + k - 1) ; i++){
            if(colors[i % n] == colors[(i - 1) % n]) left = i;
            if(i - left + 1 == k) {
                left++;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] colors = {0,1,0,1,0};
        int k = 3;
        System.out.println(numberOfAlternatingGroups(colors, k));
    }
}
