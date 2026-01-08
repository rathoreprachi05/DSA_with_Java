/* Relevant Problem Links:
1. https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
2. https://www.hackerrank.com/challenges/ctci-merge-sort/problem
3. https://leetcode.com/problems/global-and-local-inversions/description/
4. https://leetcode.com/problems/reverse-pairs/description/
5. https://leetcode.com/problems/count-of-smaller-numbers-after-self/description/
*/

import java.util.ArrayList;
import java.util.List;

// Using merge sort ---> Time Complexity : O(n log n)

public class MergeSortAndInvCount{
    int mergeSortAndCount(int arr[], int left, int right){
        if(left >= right) return 0;
        int mid = (left + right) / 2;
        int count = 0;
        count += mergeSortAndCount(arr, left, mid);
        count += mergeSortAndCount(arr, mid+1, right);
        count += mergeAndCount(arr, left, mid, right);
        return count;
    }

    int mergeAndCount(int[] arr, int left, int mid, int right){
        List<Integer> temp = new ArrayList<>();
        int i = left;
        int j = mid+1;
        int count = 0;

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }

            else{
                count += mid - i + 1;
                temp.add(arr[j]);
                j++;
            }
        }
        while(i <= mid){
                temp.add(arr[i]);
                i++;
        }

        while(j <= right){
                temp.add(arr[j]);
                j++;
        }

        for(int k = left; k <= right; k++){
            arr[k] = temp.get(k-left);
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {7,4,1,3,8,5,9,6,2};

        MergeSortAndInvCount obj = new MergeSortAndInvCount();

        int result = obj.mergeSortAndCount(arr, 0, arr.length-1);
        System.out.println(result);
    }
}
