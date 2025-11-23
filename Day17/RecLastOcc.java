/* Relevant Problem Links:
    1. https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/

class RecLastOcc{
    int recLastOcc(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; 
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            int rightResult = recLastOcc(arr, target, mid + 1, end);
            return (rightResult != -1) ? rightResult : mid;
        }
        else if (arr[mid] > target) {
            return recLastOcc(arr, target, start, mid - 1);
        }
        else {
            return recLastOcc(arr, target, mid + 1, end);
        }
    }
    public static void main(String[] args) {
        RecLastOcc obj = new RecLastOcc();
        int[] arr = {1, 2, 2, 2, 3};
        
        System.out.println(obj.recLastOcc(arr, 2, 0, arr.length - 1)); // expect 3
        System.out.println(obj.recLastOcc(arr, 1, 0, arr.length - 1)); // expect 0
        System.out.println(obj.recLastOcc(arr, 4, 0, arr.length - 1)); // expect -1
    }
}
