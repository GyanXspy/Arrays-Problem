package LeetCode_problems;
// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
import java.util.Scanner;
class Solution {
    public static boolean threeConsecutiveOdds(int[] arr) {
       int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
                
            }
            else{
                count = 0;
            }
            
        }
        return false;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length :");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println(threeConsecutiveOdds(arr));
    }
}

