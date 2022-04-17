package com.leetcode;

import java.util.ArrayList;

/**
 * @author ycb
 * @date 2022/4/13
 */
public class Problem_0115_DistinctSubsequences {

    public static int numDistinct(String s, String t) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] str = s.toCharArray();
        ArrayList<String> path = new ArrayList<>();
        process(str, 0, "", path);
        int ans = 0;
        for (String cur : path) {
            if (cur.equals(t)) {
                ans++;
            }
        }
        return ans;
    }

    public static void process(char[] str, int index, String preS, ArrayList<String> path) {
        if (index == str.length) {
            return;
        }
        process(str, index + 1, preS, path);
        String cur = preS;
        preS += str[index];
        path.add(preS);
        process(str, index + 1, preS, path);
        preS = cur;
    }

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int ans = numDistinct(s, t);
        System.out.println(ans);
    }
}