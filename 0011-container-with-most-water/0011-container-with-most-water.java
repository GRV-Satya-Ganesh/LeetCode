class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int areaMax = 0;

        while(l < r){
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            int area = h*w;

            areaMax = Math.max(area, areaMax);

            while(l < r && height[l] <= h) l++;

            while(l < r && height[r] <= h) r--;
        }

        return areaMax;
    }
}