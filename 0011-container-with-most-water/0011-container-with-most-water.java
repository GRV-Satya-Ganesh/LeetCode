class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int left = 0;
        int right = n-1;

        int maxArea = 0;

        while(left < right){
            int length = Math.min(height[left], height[right]);
            int width = right-left;
            int area = length * width;

            maxArea = (maxArea < area) ? area : maxArea;

            while(left < right && height[left] <= length) left++;
            while(left < right && height[right] <= length) right--;
        }

        return maxArea;
    }
}