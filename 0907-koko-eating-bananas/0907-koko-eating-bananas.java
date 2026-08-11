class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int h, int mid) {
        long hours = 0;

        for (int pile : piles) {
            hours += (pile + mid - 1) / mid;
        }

        return hours <= h;
    }
}