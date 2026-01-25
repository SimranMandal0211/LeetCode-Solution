import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> same = new ArrayList<>();

        Arrays.sort(nums);   // keep your sorting logic

        int expected = 1;    // numbers should be from 1 to n

        for (int i = 0; i < n; i++) {

            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // add missing numbers before nums[i]
            while (expected < nums[i] && expected <= n) {
                same.add(expected);
                expected++;
            }

            // move expected if matched
            if (expected == nums[i]) {
                expected++;
            }
        }

        // add remaining missing numbers after loop
        while (expected <= n) {
            same.add(expected);
            expected++;
        }

        return same;
    }
}
