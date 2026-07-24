class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxAmount = 0;

        for(int[] customer: accounts){
            int totalAmount = 0;
            for(int amount: customer){
                totalAmount += amount;
            }
            maxAmount = (maxAmount < totalAmount) ? totalAmount : maxAmount;
        }
        
        return maxAmount;
    }
}