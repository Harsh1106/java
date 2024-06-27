import java.util.*;
class myCmp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a % 2 - b % 2;
    }
} 
class main1{
    public static void main(String[] args){
        Integer arr[] = {5,20,10,3,12};
        Arrays.sort(arr, new myCmp());
        System.out.println(Arrays.toString(arr));
    }
}