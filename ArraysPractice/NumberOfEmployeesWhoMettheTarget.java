public class NumberOfEmployeesWhoMettheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int count = 0;
        for(int num : hours){
            count += (num >= target) ? 1 : 0; 
        }
        return count;
    }
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}
