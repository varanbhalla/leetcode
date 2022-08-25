class Solution {
    public int numIdenticalPairs(int[] nums) {
        int numOfGoodPairs = 0;
        final int INITIAL_OCCURANCE = 1;
        Map<Integer, Integer> map = new HashMap(); // Map<Number, CountOfOccurance>
        for (int element: nums) {
            if (map.containsKey(element)) {
                int oldOccurance = map.get(element);
                int newOccurance = oldOccurance + 1;
                map.put(element, newOccurance);
                numOfGoodPairs += oldOccurance;
            } else {
                map.put(element, INITIAL_OCCURANCE);
            }
        }
        return numOfGoodPairs;
    }
}