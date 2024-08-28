public class numberOfSwap {
    public static long swapCount(String s){
        char[] ch = s.toCharArray();
        int cL = 0, cR = 0, swap = 0, imbalance = 0;
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == '['){
                cL++;
                if(imbalance > 0){
                    swap += imbalance;
                    imbalance--;
                }
            }
            else if(ch[i] == ']'){
                cR++;
                imbalance = cR - cL;
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        String str = "[]][][";
        System.out.println(swapCount(str));

        String str1 = "[[][]]";
        System.out.println(swapCount(str1));
    }
}
