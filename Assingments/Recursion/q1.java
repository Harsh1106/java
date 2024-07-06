public class q1{
    public static int sum(int num){
        int res = 0;
        if(num == 0){
            return 0;
        }
        else{
            res = num % 10 + sum(num / 10);
        }
        return res;
    }
    public static void main(String[] args) {
        int num = 1234;
        int res = sum(num);
        System.out.println(res);
    }
}