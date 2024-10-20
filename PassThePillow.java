package LeetCode_problems;

import java.util.Scanner;

// pass-the-pillowThere are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.
public class PassThePillow {
    public static int passThePillow(int n, int time){
        int cpos = 1;
        int direct = 1;
        for (int i = 0; i < time; i++) {
            cpos +=direct;
            if (cpos == n) {
                direct = -1;
            }else if (cpos == 1) {
                direct = 1;
            }
        }
        return cpos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people :");
        int n = sc.nextInt();
        System.out.println("Enter the time :");
        int time = sc.nextInt();
        System.out.println("Last element = "+passThePillow(n, time));
    }
}
