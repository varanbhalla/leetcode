class Solution {
    public int xorOperation(int numsLength, int start) {
        int XORSum = 0;
        int[] nums = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            nums[i] = start + (2 * i);
            XORSum ^= nums[i];
        }
        return XORSum;
    }
}