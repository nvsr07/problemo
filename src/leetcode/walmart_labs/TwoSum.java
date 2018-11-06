package leetcode.walmart_labs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * https://leetcode.com/problems/two-sum/*/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int intersect = target - nums[i];
            if(record.containsKey(intersect)){
                return new int[]{record.get(intersect), i};
            }
            record.put(nums[i], i);
        }
        return new int[]{};
    }
}
