package leetcode;

import java.util.Arrays;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 27 Aug 2020, 8:33 PM
 */
public class P3
{
    public static int lengthOfLongestSubstring(String s)
    {
        int[] last = new int[128];
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            start = Math.max(start, last[c]);
            res = Math.max(res, i - start + 1);
            last[c] = i + 1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
