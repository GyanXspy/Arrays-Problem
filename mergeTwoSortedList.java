package LeetCode_problems;

import java.util.Scanner;

public class mergeTwoSortedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first array :");
        int l = sc.nextInt();
        System.out.print("Enter the lemgth of second array :");
        int x = sc.nextInt();
        int [] arr = new int[l];
        int [] crr = new int[x];
        System.out.println("Enter the element to the first array  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the second array ");
        for (int i = 0; i < crr.length; i++) {
            crr[i] = sc.nextInt();

        }

        System.out.print("\n"+"UnSorted first array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n"+"UnSorted second array :");
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i]+" ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < crr.length-1; i++) {
            for(int j = 0; j<crr.length-i-1; j++){
                if (crr[j]>crr[j+1]) {
                    int temp = crr[j];
                    crr[j] = crr[j+1];
                    crr[j+1] = temp;
                }
            }
        }
        System.out.print("\n"+"Sorted first array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+" ");
        }
        System.out.print("\n"+"sorted second array :");
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i]+" ");
        }
        System.out.println("\n"+"merge two array");
        int [] c = new int[l+x];
        System.arraycopy(arr, 0, c, 0, l);
        System.arraycopy(crr, 0, c, l, x);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");

        }
        System.out.println();
    }
}
