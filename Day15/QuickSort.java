/* Relevant Problem Links:
    1. https://leetcode.com/problems/sort-an-array/description/
    2. https://leetcode.com/problems/kth-largest-element-in-an-array/description/
    3. https://leetcode.com/problems/sort-colors/description/
    4. https://www.hackerrank.com/challenges/quicksort3/problem
    5. https://www.hackerrank.com/challenges/quicksort1/problem
*/


class QuickSort{
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int smallIndex = low - 1;

        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                smallIndex++;
                swap(arr, smallIndex, j);
            } 
        }
        swap(arr, smallIndex+1, high);
        return smallIndex+1;
    }

    void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};

        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
