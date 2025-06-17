public class LeetcodeQ1{
    int adjDiff(int[] arr){
        int maxDiff = 0;

        for(int i=0; i<arr.length; i++){
            maxDiff = Math.max(maxDiff, Math.abs(arr[i] - arr[(i+1) % arr.length]));
        }

        return maxDiff;
    }

    public static void main(String[] args){
        LeetcodeQ1 obj = new LeetcodeQ1();

        int[] input = {5, 2, 9, 1};
        
        System.out.print(obj.adjDiff(input));
    }
}