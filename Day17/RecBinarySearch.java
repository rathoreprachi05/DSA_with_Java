/* Relevant Problem Links:
    1. https://leetcode.com/problems/binary-search/description/
    2. https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
    3. https://www.hackerrank.com/contests/lpdwarka2016/challenges/binary-search-basic
*/

// Binary Search using recursion

import java.util.Scanner;
class RecBinarySearch{
    int recBinarySearch(int[] arr, int left, int right, int target){
        if(left > right) return -1;

        int mid = left + (right - left)/2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target){
            return recBinarySearch(arr, mid+1, right, target);
        } else {
            return recBinarySearch(arr, left, mid-1, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecBinarySearch rbs = new RecBinarySearch();

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = rbs.recBinarySearch(arr, 0, arr.length - 1, target);

        if (result == -1) {
            System.out.println("Target not found!");
        } else {
            System.out.println("Target found at index: " + result);
        }

        sc.close();
    }
}
