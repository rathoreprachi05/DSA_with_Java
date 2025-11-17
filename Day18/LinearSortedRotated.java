// Leetcode Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Similar problem Link (Leetcode): https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class LinearSortedRotated{
    boolean searchInRotatedArr(int[] arr, int target){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] == target) return true;
        }
        
        return false;
    }
    public static void main(String[] args){
        LinearSortedRotated lsr = new LinearSortedRotated();
        int[] arr = {3,4,5,1,2};
        int target = 5;
        System.out.println(lsr.searchInRotatedArr(arr, target));
    }
}
