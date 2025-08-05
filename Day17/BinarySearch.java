import java.util.Scanner;

class BinarySearch{
    int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BinarySearch bs = new BinarySearch();

        System.out.println("Array size: ");
        int size = sc.nextInt();

        System.out.println("Array eLements: ");
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Target: ");
        int target = sc.nextInt();
        
        System.out.println(bs.binarySearch(arr, target));
    }
}