class SearchInRotatedArray {
    boolean searchInRotatedArr(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        SearchInRotatedArray lsr = new SearchInRotatedArray();
        int[] arr = {3, 4, 5, 1, 2};
        int target = 5;
        System.out.println(lsr.searchInRotatedArr(arr, target)); // true
        System.out.println(lsr.searchInRotatedArr(arr, 9)); // false
    }
}
