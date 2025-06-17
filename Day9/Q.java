class MaxDiff{
    int maxDiff(int[] arr){
        int maxi = 0;

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    maxi = Math.max(maxi, arr[j] - arr[i]);
                }
            }
        }
        return maxi;
    }

    int maxDiffOptimized(int[] arr){
        int minSoFar = arr[0];
        int maxDiff = 0;

        for(int i=1; i<arr.length; i++){
            int diff = arr[i] - minSoFar;
            if(diff > maxDiff) maxDiff = diff;
            if(arr[i] < minSoFar) minSoFar = arr[i];
        }
        return maxDiff;
    }
}

class Q{
    public static void main(String[] args){
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        MaxDiff obj = new MaxDiff();

        int result = obj.maxDiff(arr);
        System.out.println(result);

        int resultOpt = obj.maxDiffOptimized(arr);
        System.out.println(resultOpt);
    }
}