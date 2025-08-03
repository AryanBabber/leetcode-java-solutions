import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> idxMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            Integer reqNum = (Integer) (target - nums[i]);
            if(idxMap.containsKey(reqNum)) {
                int ret[] = {idxMap.get(reqNum), i};
                return ret;
            }
            idxMap.put(nums[i], i);
        }
        return null;
    }
}