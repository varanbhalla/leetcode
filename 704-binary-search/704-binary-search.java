class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = nums[mid];
            if (midElement == target) 
                return mid;
            else if (midElement > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}