public class PrintAllPermutations {

    public static String swap(String str, int i, int j){

        char[] charArray = str.toCharArray();

        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void permute(String inputStr, int start, int end){
        if(start == end){
            System.out.println(inputStr);
        }else{
            for(int i = start ; i <= end ; i++){
                inputStr = swap(inputStr, start, i);
                permute(inputStr, start + 1, end);

                // backtracking
                inputStr = swap(inputStr, start, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        System.out.println("For the string : "+str+" permutations are : ");
        permute(str, 0, n - 1); 
        System.out.println();       
        String str1 = "Harsh";
        int n2 = str1.length();
        System.out.println("For the string : "+str1+" permutations are : ");
        permute(str1, 0, n - 1);        
    }
}
