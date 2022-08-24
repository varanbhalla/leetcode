class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelInStoneCount = 0;
        for (char stone: stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                jewelInStoneCount ++;
            }
        }
        return jewelInStoneCount;
    }
}