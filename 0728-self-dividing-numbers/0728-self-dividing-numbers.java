class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(i % 10 == 0) continue;

            if(isSelfDividing(i)) result.add(i);
        }

        return result;
    }

    private boolean isSelfDividing(int num){
        if(num < 10) return true;

        int n = num;

        while(n > 0){
            int digit = n % 10;
            if(digit == 0 || num % digit != 0) return false;

            n /= 10;
        }

        return true;
    }
}