import java.util.*;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum2 = nums[i] + nums[l] + nums[r];

                if (sum2 == target)
                    return sum2;
                if (Math.abs(sum2 - target) < Math.abs(sum - target))
                    sum = sum2;
                if (sum2 < target)
                    ++l;
                else
                    --r;
            }
        }

        return sum;
    }
}