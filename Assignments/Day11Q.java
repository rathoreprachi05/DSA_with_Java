import java.util.ArrayList;

class Day11Q{
    public static void main(String[] args){
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
    }
}