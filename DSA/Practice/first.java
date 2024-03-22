//inputting in array
import java.util.Scanner;
public class first{
    public static void update(int marks[]){
        for(int i = 0 ; i < marks.length ; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < marks.length ; i++){
            marks[i] = sc.nextInt();
        }
        //passing array as an argument
        update(marks); 
        //print our marks
        for(int i = 0 ; i < marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
    }
}