class Solution {
    public int xorOperation(int n, int start) {
        int XORSum = 0;
        for (int i = 0; i < n; i++) {
            XORSum ^= start + (2 * i);
        }
        return XORSum;
    }
}