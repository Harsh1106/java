public class FindThePunishmentNumberofanInteger {
    public static boolean perfect(String sq, int t, int i, int sum){
        if(i == sq.length()) return sum == t;
        int num = 0;
        for(int j = i; j < sq.length() ; j++){
             num = num*10 + (sq.charAt(j) - '0');
             if(perfect(sq, t, j + 1, sum + num)) return true; 
        }
        return false;
     }
     public static int punishmentNumber(int n) {
         int total = 0;
         for(int i = 1 ; i <= n ; i++){
             int sq = i*i;
             String sqStr = Integer.toString(sq);
             if(perfect(sqStr, i, 0, 0))
                 total += sq;
         }
         return total;
     }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(punishmentNumber(n));
    }
}
