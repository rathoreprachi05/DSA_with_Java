// LeetCode Question Link: https://leetcode.com/problems/koko-eating-bananas/

/* Question: Koko the monkey loves bananas! There are several piles of bananas, each with a different amount. The guards are gone for h hours.
Koko wants to eat all the bananas before the guards get back. She needs to decide on an eating speed, k, which is how many bananas she eats per hour.

Here are the rules:
Koko picks a single pile of bananas to eat from each hour.
She eats k bananas from that pile.
If a pile has fewer than k bananas, she eats all of them in that hour and then stops to rest (she doesn't move to another pile until the next hour).
She wants to eat as slowly as possible, but still finish everything within the h hours.

Your job: Find the minimum possible eating speed (k) that allows Koko to eat all the bananas in all the piles before the h hours are up.
*/

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
