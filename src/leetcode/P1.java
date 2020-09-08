package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class P1
{
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target)
    {
        int[] indexes = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                indexes[0] = i;
                indexes[1] = map.get(nums[i]);
                break;
            }
            map.put(target - nums[i], i);
        }
        return indexes;
    }

    public static void main(String[] args)
    {
        int[] ints = twoSum2(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }
}
