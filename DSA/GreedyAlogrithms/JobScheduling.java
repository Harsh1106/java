// TC: O(n^2)
// SC: O(n)

import java.util.*;
public class JobScheduling{
    char id;
    int deadline, profit;
    public JobScheduling(){}
    
    public JobScheduling(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    void printJobSequence(ArrayList<JobScheduling> al, int maxDeadline){
        int n = al.size();
        // 1. Sort the jobs in the decreasing order of profit.
        // Lambda expression
        // TC:O(nlogn) (if merge sort is used)
        Collections.sort(al, (a,b) -> b.profit - a.profit);

        // need to create the array to keep the track of the booked slots
        boolean res[] = new boolean[maxDeadline];

        // to store the job ids
        char jobs[] = new char[maxDeadline];

        // 2. need to store the jobids according to the given deadline
        // TC: O(n^2)
        for(int i = 0 ; i < n ; i++){
            for(int j = Math.min(maxDeadline - 1, al.get(i).deadline - 1) ; j >= 0 ; j--){
                // if the slot is available then it will be false
                if(res[j] == false){
                    res[j] = true;
                    jobs[j] = al.get(i).id; //allocated that slot to the current job id
                    break;
                }
            }
        }
        for(char id : jobs){
            System.out.print(id+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<JobScheduling> al = new ArrayList<>();
        al.add(new JobScheduling('1', 5, 55));
        al.add(new JobScheduling('2', 2, 65));
        al.add(new JobScheduling('3', 7, 75));
        al.add(new JobScheduling('4', 3, 60));
        al.add(new JobScheduling('5', 2, 70));
        al.add(new JobScheduling('6', 1, 50));
        al.add(new JobScheduling('7', 4, 85));
        al.add(new JobScheduling('8', 5, 68));
        al.add(new JobScheduling('9', 3, 45));

        System.out.println("Job Sequences to get the maximum profit: ");
        JobScheduling job = new JobScheduling();
        job.printJobSequence(al, 7);
    }
}