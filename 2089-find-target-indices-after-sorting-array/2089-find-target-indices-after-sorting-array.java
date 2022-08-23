import java.util.Arrays;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indicesList = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                indicesList.add(i);
            }
        }
        return indicesList;
    }
}