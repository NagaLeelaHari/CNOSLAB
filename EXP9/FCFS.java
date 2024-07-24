package operating;
import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bt[] = new int[20];
        int wt[] = new int[20];
        int tat[] = new int[20];
        int n;
        float wtavg, tatavg;

        System.out.println("Enter the number of processes:");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Burst Time for Process " + i + ":");
            bt[i] = sc.nextInt();
        }

        wt[0] = 0;
        wtavg = 0;
        tat[0] = bt[0];
        tatavg = bt[0];

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
            tat[i] = tat[i - 1] + bt[i];
            wtavg += wt[i];
            tatavg += tat[i];
        }

        System.out.println("\tPROCESS\tBURST TIME\tWAITING TIME\tTURNAROUND TIME");
        for (int i = 0; i < n; i++) {
            System.out.println("\tP" + i + "\t\t" + bt[i] + "\t\t" + wt[i] + "\t\t" + tat[i]);
        }

        System.out.println("Average Waiting Time: " + (wtavg / n));
        System.out.println("Average Turnaround Time: " + (tatavg / n));
       
        sc.close();
    }
}
