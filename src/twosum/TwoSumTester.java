package twosum;

import util.OutPutUtil;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTester {

    public int[] twoSum(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return new int[]{};
        }

        int[] returnNums = new int[2];
        for (int i = 0, j = i + 1; i < nums.length;) {
            if (nums[j] == target - nums[i]) {
                returnNums[0] = i;
                returnNums[1] = j;
                break;
            } else {
                j ++;
                if (j == nums.length) {
                    i ++;
                    j = i + 1;
                }
            }
        }

        return returnNums;
    }

    public static void main(String[] args) {
        TwoSumTester tt = new TwoSumTester();
        int[] resultArray = tt.twoSum(new int[]{1,2,3,4}, 4);
        OutPutUtil.print(resultArray);

        int[] case2 = tt.twoSum(new int[]{1,2,3,4,20}, 21);
        OutPutUtil.print(case2);

        int[] case3 = tt.twoSum(new int[]{1,2,3,4, 9}, 11);
        OutPutUtil.print(case3);

        int[] case4 = tt.twoSum(new int[]{-1 ,-2,-3,-4,-5}, -8);
        OutPutUtil.print(case4);

        Map<Integer,Integer> map = new HashMap<>();
        map.containsKey(1);
    }
}
