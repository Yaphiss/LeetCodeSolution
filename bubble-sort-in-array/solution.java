import java.util.Arrays;

class Solution {
    public int[] solution (int[] nums) {
        int len = nums.length;
        if (len == 0) return new int[]{};
        int tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,7,3,3,5,8,2,1,5,2,8,9,6,11};
        int[] sort = new Solution().solution(nums);
        System.out.println("result: "+Arrays.toString(sort));
    }
}