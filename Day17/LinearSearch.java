/* Relevant Problem Links:
    1. https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    2. https://www.hackerrank.com/challenges/tutorial-intro/problem
*/

import java.util.Scanner;

class LinearSearch {

    // Method for linear search in an integer array
    int linearSearchInt(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Method for linear search in a string array
    int linearSearchStr(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch ls = new LinearSearch();

        // Integer array search
        System.out.print("Enter array size (integers): ");
        int intArraySize = sc.nextInt();
        int[] intArr = new int[intArraySize];

        System.out.println("Enter " + intArraySize + " integer elements:");
        for (int i = 0; i < intArraySize; i++) {
            intArr[i] = sc.nextInt();
        }

        System.out.print("Enter target integer to search: ");
        int intTarget = sc.nextInt();

        int intResult = ls.linearSearchInt(intArr, intTarget);
        if (intResult == -1) {
            System.out.println("Integer not found.");
        } else {
            System.out.println("Integer found at index: " + intResult);
        }

        sc.nextLine(); // Clear the buffer

        // String array search
        System.out.print("\nEnter number of strings: ");
        int strArraySize = sc.nextInt();
        sc.nextLine(); // Clear newline

        String[] strArr = new String[strArraySize];
        System.out.println("Enter " + strArraySize + " strings:");
        for (int i = 0; i < strArraySize; i++) {
            strArr[i] = sc.nextLine();
        }

        System.out.print("Enter target string to search: ");
        String strTarget = sc.nextLine();

        int strResult = ls.linearSearchStr(strArr, strTarget);
        if (strResult == -1) {
            System.out.println("String not found.");
        } else {
            System.out.println("String found at index: " + strResult);
        }

        sc.close();
    }
}
