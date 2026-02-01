/* Relevant Problem Links:
    1. https://www.geeksforgeeks.org/problems/selection-sort/1
    2. https://leetcode.com/problems/sort-an-array/description/
    3. https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
    4. https://www.codechef.com/problems/TSORT
    5. https://atcoder.jp/contests/abc042/tasks/abc042_a
*/


public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        int[] sortedArr = sorter.selectionSort(arr);

        System.out.println("\nSorted array:");
        for(int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
