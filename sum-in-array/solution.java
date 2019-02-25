import java.util.HashMap;

class Solution {
    public int solution (int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if(map.containsKey(n)) return new int[]{map.get(n), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution!")
    }
}