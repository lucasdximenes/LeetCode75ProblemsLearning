package leetCode392;

public class Solution {
    // LeetCode 392 - Is Subsequence
    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";

        // Expected Output #1 = true
        System.out.println(isSubsequence(s1, t1));

        // Expected Output #2 = false
        System.out.println(isSubsequence(s2, t2));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int sIndex = 0;
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
