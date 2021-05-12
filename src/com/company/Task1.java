package com.company;

import java.util.Scanner;
import java.lang.*;


public class Task1 {

    static void reversearr(int arr[], int n)
    {
        int[] A = new int[n];
        int b = n;
        for (int i = 0; i < n; i++) {
            A[b - 1] = arr[i];
            b = b - 1;
        }

        System.out.print("Reversed array is: ");
        for (int a = 0; a < n; a++) {
            System.out.print(A[a] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        System.out.print("Enter the number of digits in the array: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.print("Fill the array with numbers: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        reversearr(arr, n);
    }
}