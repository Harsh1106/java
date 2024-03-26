import java.io.*;
import java.util.*;
public class main{
public static void main(String[] args)throws IOException{
    System.out.println("Enter the number of halls:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<Hall> halls = new ArrayList<>();
    for(int i = 0 ; i < n ; i++){
        String details = sc.nextLine();
        String[] parts = details.split(",");
        halls.add(new Hall(parts[0].trim(), Double.parseDouble(parts[1].trim()), parts[2].trim()));
    }
    Collections.sort(halls, (h1, h2)->h1.getOwner().compareTo(h2.getOwner()));
    System.out.format("%-15s %- 10s %s\n", "Name", "Cost", "Owner");
    for(Hall hall : halls){
        System.out.format("%-15s %- 10s %s\n", hall.getName(), hall.getCostPerDay(), hall.getOwner());
    }
    sc.close();
    }
}