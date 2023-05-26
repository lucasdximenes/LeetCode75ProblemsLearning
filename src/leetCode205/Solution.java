package leetCode205;

import java.util.HashMap;

public class Solution {
    // LeetCode 205. Isomorphic Strings
    public static void main(String[] args) {
        String input1s = "egg";
        String input1t = "add";
        System.out.println(isIsomorphic(input1s, input1t));
        // Expected Output: true


        String input2s = "foo";
        String input2t = "bar";
        System.out.println(isIsomorphic(input2s, input2t));
        // Expected Output: false

        String input3s = "paper";
        String input3t = "title";
        System.out.println(isIsomorphic(input3s, input3t));
        // Expected Output: true
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sCurrChar = s.charAt(i);
            char tCurrChar = t.charAt(i);

            if (charMap.containsKey(sCurrChar)) {
                if (charMap.get(sCurrChar) != tCurrChar) {
                    return false;
                }
            } else {
                if (charMap.containsValue(tCurrChar)) {
                    return false;
                }
                charMap.put(sCurrChar, tCurrChar);
            }
        }

        return true;
    }
}
