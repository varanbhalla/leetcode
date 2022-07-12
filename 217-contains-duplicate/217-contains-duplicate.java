class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicateFound = false;
        Set<Integer> set = new HashSet();
        
        for (int element: nums) {
            if (set.contains(element)) {
                duplicateFound = true;
                return duplicateFound;
            } else {
                set.add(element);
            }
        }
        return duplicateFound;
    }
}