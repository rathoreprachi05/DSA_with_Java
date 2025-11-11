class SearchRotArrBin {
    boolean searchRotArrBin(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) return true;

            
            // Left half is sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        SearchRotArrBin sr = new SearchRotArrBin();
        int[] arr = {3, 4, 5, 1, 2};
        int target = 5;
        System.out.println(sr.searchRotArrBin(arr, target)); // true
        System.out.println(sr.searchRotArrBin(arr, 9)); // false
    }
}
