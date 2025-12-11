package com.array;

import java.util.Scanner;

public class Removeduplicateelement {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sobj.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sobj.nextInt();
        }
        
       int n=arr.length;

        // -------- Step 2: Remove duplicates --------
        int j = 0; // index of last unique element
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
               
                arr[j++] = arr[i];
            }
        }
        arr[j++]=arr[n-1];

        // -------- Step 3: Print result --------
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + "\t");
        }

        sobj.close();
    }
}
