import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (numMap.containsKey(need)) {
                return new int[]{numMap.get(need), i};
            }
            numMap.put(nums[i], i);
        }

       return new int[2];
    }
}