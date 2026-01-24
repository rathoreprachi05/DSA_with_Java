/*Relevant Links:
    hackerrank Link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem
    LeetCode Link: https://www.hackerrank.com/challenges/sherlock-and-squares/problem
*/

import java.util.Arrays;

class MergeSort{
    public int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];

        int i=0;
        int j=0; 
        int k=0;

        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            result[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    public int[] mergeSort(int[] arr){
        if(arr.length <=1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);
    }

    public static void main(String[] args) {
    MergeSort ms = new MergeSort();
    int[] arr = {5, 2, 9, 1, 6};
    int[] sorted = ms.mergeSort(arr);

    System.out.println(Arrays.toString(sorted));
}
}
