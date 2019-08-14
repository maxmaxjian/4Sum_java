import java.util.*;

public class Solution1 implements Solution {
    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int start = j+1, end = nums.length-1;
                while (start < end) {
                    if (nums[i]+nums[j]+nums[start]+nums[end] == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                    } else if (nums[i]+nums[j]+nums[start]+nums[end] < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}
