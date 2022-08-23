class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indicesList = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                indicesList.add(i);
                
                if (i == nums.length-1) 
                    continue;
                int nextElement = nums[i+1];
                if (element != nextElement) 
                    break;
            }
        }
        return indicesList;
    }
}