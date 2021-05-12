package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Task2 {

    public static int[] removearr(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] anotherArr = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArr[k++] = arr[i];
        }

        return anotherArr;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of digits in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println();
        System.out.print("Fill the array with numbers: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Array of which index do you want to delete: ");
        int index = sc.nextInt();

        arr = removearr(arr, index);

        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}