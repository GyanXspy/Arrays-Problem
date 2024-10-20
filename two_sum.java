package LeetCode_problems;

import java.util.Scanner;

public class two_sum {
    public static void TwoSum(int []arr, int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j<arr.length; j++){
                if (arr[i]+arr[j]==x){
                    System.out.println(i+" "+j);
                }
               
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array :");
        int l = sc.nextInt();
        int [] arr = new int[l];
        // insert the element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        // display the array
        System.out.println("the elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");

        }
        System.out.print("\nEnetr the sum :");
        int x = sc.nextInt();
        TwoSum(arr, x);
        

    }
}
