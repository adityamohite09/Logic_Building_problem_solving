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

        // -------- Step 1: Sort using brute-force (Selection Sort logic) --------
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // -------- Step 2: Remove duplicates --------
        int j = 0; // index of last unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // -------- Step 3: Print result --------
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + "\t");
        }

        sobj.close();
    }
}
