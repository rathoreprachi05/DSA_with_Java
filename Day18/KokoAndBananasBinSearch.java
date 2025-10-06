class KokoAndBananasBinSearch {

    boolean check(int k, int[] arr, int h) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += (arr[i] + k - 1) / k; // ceiling trick
        }
        return totalHours <= h;
    }
    int minSpeed(int[] arr, int h) {
        int maxPile = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPile) {
                maxPile = arr[i];
            }
        }

        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(mid, arr, h)) {
                ans = mid;       // store possible answer
                high = mid - 1;  // try smaller speed
            } else {
                low = mid + 1;   // need faster speed
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        KokoAndBananasBinSearch obj = new KokoAndBananasBinSearch();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Minimum speed Koko needs: " + obj.minSpeed(piles, h));
    }
}
