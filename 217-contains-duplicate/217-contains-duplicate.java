class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        
        for (int element: nums) {
            if (set.contains(element)) {
                return true; // duplicate found
            } else {
                set.add(element);
            }
        }
        return false; // duplicate not found
    }
}

// Time:  O(n) 
// Space: O(n)