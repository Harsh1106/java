public class q5 {
    public static int numOfDigits(int num){
        if(num == 0){
            return 0;
        }
        return 1 + numOfDigits(num / 10);
    }

    public static int sumOfPow(int num, int pow){
        if(num == 0){
            return 0;
        }
        int digit = num % 10;
        return (int)Math.pow(digit, pow) + sumOfPow(num / 10, pow);
    }

    public static boolean findArm(int num){
        int pow = numOfDigits(num);
        return num == sumOfPow(num, pow);
    }
   public static void main(String[] args) {
        int num = 153;
        if(findArm(num)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
   } 
}
