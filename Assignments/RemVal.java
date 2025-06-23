import java.util.ArrayList;
import java.util.Arrays;

class RemVal{
    public static void main(String[] args){
// Using extra space

        ArrayList<Integer> res = new ArrayList<>();

        int[] arr = {3,2,2,3};
        int val = 2;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                res.add(arr[i]);
            }
        }

        System.out.println(res);
        System.err.println(res.size());


// In-place --> without using extra space

        int count = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[j] != val){
                arr[count] = arr[j];
                count++;
            }
        }
        
        System.err.println(Arrays.toString(arr));
        System.err.println(count);

    }
}

