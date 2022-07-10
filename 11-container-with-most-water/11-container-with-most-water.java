class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int potentialMax = Integer.MIN_VALUE;
        int maxArea = Integer.MIN_VALUE;
        
        while (leftIndex < rightIndex) {
            int leftHeight = height[leftIndex];
            int rightHeight = height[rightIndex];
            int minHeight = Math.min(leftHeight, rightHeight);
            int width = rightIndex - leftIndex;
            
            potentialMax = minHeight * width;
            maxArea = Math.max(potentialMax, maxArea);
            
            if (leftHeight < rightHeight) {
                leftIndex ++;
            } else {
                rightIndex --;
            }
        }
        return maxArea;
    }
}