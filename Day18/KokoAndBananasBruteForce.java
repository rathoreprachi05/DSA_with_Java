/*
Problem:
Koko loves bananas. Each element in the array 'piles[]' represents the number of bananas in a pile.
Koko can eat only from one pile per hour at a fixed speed 'k' bananas/hour.
She must finish all bananas within 'h' hours before the guard returns.
Find the minimum integer speed 'k' at which Koko can finish all bananas on time.
*/


class KokoAndBananasBruteForce {

    // Method to check if Koko can eat all bananas at speed k within h hours
    boolean check(int k, int[] arr, int h) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            // Ceiling division trick
            totalHours += (arr[i] + k - 1) / k;
        }
        return totalHours <= h;
    }

    // Method to find the minimum speed k using brute force
    int minSpeed(int[] arr, int h) {
        // Find the largest pile size
        int maxPile = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPile) {
                maxPile = arr[i];
            }
        }

        // Try all speeds from 1 to maxPile
        for (int k = 1; k <= maxPile; k++) {
            if (check(k, arr, h)) {
                return k; // first speed that works is the minimum
            }
        }
        return -1; // should not happen for valid inputs
    }

    // Main method to test the program
    public static void main(String[] args) {
        KokoAndBananasBruteForce obj = new KokoAndBananasBruteForce();
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = obj.minSpeed(piles, h);
        System.out.println("Minimum speed Koko needs: " + result);
    }
}
