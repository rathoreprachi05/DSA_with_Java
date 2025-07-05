class InsertionSort{
    public int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
    InsertionSort sorter = new InsertionSort();

    int[] arr = {9, 5, 1, 4, 3};
    int[] sortedArr = sorter.insertionSort(arr);

    System.out.print("Sorted array: ");
    for (int num : sortedArr) {
        System.out.print(num + " ");
    }
}
}