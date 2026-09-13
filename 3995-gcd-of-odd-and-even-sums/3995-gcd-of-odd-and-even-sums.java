class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 1; i <= n; i++){
            sumEven += 2*i;
            sumOdd += 2*i - 1;
        }

        while(sumOdd != 0 && sumEven != 0){
            if(sumOdd > sumEven) sumOdd %= sumEven;
            else sumEven %= sumOdd;
        }

        return (sumOdd == 0) ? sumEven : sumOdd;
    }
}