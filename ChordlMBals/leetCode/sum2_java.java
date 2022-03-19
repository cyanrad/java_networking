package leetCode;

import java.util.HashSet;

class sum2_java {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> dupe = new HashSet<Integer>();
        for (int item : nums) {
            dupe.add(item);
        }

        int result;
        for (int i = 0; i < nums.length; i++) {
            result = target - nums[i];
            int j;

            if (dupe.contains(result)) {
                for (j = i + 1; j < nums.length; j++) {
                    if (nums[j] == result) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return new int[] { -1, -1 };
    }
}