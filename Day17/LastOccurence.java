/* Relevant problem links:
    1. https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
    2. https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/

class LastOccurence{
    int lastOcc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;   
                start = mid + 1; 
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        LastOccurence obj = new LastOccurence();
        
        int[] arr = {1, 2, 2, 2, 3};
        System.out.println(obj.lastOcc(arr, 2)); // expect 3
        System.out.println(obj.lastOcc(arr, 1)); // expect 0
        System.out.println(obj.lastOcc(arr, 4)); // expect -1

    }
}
