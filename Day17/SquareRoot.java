class SquareRoot{
    int sqrt(int x){
        if (x < 0) throw new IllegalArgumentException("Negative input not allowed");
        if(x == 0 || x == 1) return x;
        if (x < 4) return 1;

        int low = 1;
        int high = x/2;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            long square = (long) mid * mid;

            if(square == x) return (int)mid;
            else if(square < x){
                ans = mid;
                low = mid+1;
            }
           else{
            high = mid - 1;
           } 
        }
        return ans;
    }

    public static void main(String[] args) {
        
        SquareRoot mySqrt = new SquareRoot(); 
        int[] numbers = {0, 1, 2, 3, 4, 5, 10, 16, 17, 50}; 

        for (int num : numbers) { 
            try {
                int result = mySqrt.sqrt(num); 
                System.out.println("Square root of " + num + " is " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Cannot find square root of " + num + ": " + e.getMessage());
            }
        }
    }
}