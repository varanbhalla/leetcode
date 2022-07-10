class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while (leftIndex < rightIndex) {
            int leftPole = height[leftIndex];
            int rightPole = height[rightIndex];
            int length = Math.min(leftPole, rightPole);
            int breadth = rightIndex - leftIndex;
            int currentArea = length * breadth;
            maxArea = Math.max(maxArea, currentArea);
            if (leftPole < rightPole) {
                leftIndex ++;
            } else {
                rightIndex --;
            }
        }
        return maxArea;
    }
}

// Area of rectangle = length * breadth