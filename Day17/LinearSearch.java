import java.util.Scanner;

class LinearSearch{
    int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
    }
    return -1;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter array size: ");
    int arr_size = sc.nextInt();
    int[] arr = new int[arr_size];

    System.out.println("Enter array elements: ");
    for(int i=0; i<arr_size; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter target value: ");
    int target = sc.nextInt();

    LinearSearch ls = new LinearSearch();
    System.out.println(ls.linearSearch(arr, target));
}
}