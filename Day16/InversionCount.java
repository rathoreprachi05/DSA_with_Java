/* Relevant Problem Links:
    1. https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
*/

public class InversionCount{

    // Brute Force approach ---> Time Complexity : O(n^2)

    int inversionCount(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        InversionCount obj = new InversionCount();
        System.out.println(obj.inversionCount(arr));
    }
}



