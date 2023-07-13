package leetCode1768;

public class Solution {
    public static void main(String[] args) {
        String input1Word1 = "abc";
        String input1Word2 = "pqr";
        // Expected output = "apbqcr"
        System.out.println(mergeAlternately(input1Word1, input1Word2));

        String input2Word1 = "ab";
        String input2Word2 = "pqrs";
        // Expected output = "apbqrs";
        System.out.println(mergeAlternately(input2Word1, input2Word2));

        String input3Word1 = "abcd";
        String input3Word2 = "pq";
        // Expected output = "apbqcd";
        System.out.println(mergeAlternately(input3Word1, input3Word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int word1p = 0;
        int word2p = 0;

        while (word1p < word1.length() && word2p < word2.length()) {
            merged.append(word1.charAt(word1p++));
            merged.append(word2.charAt(word2p++));
        }

        while (word1p < word1.length()) {
            merged.append(word1.charAt(word1p++));
        }

        while (word2p < word2.length()) {
            merged.append(word2.charAt(word2p++));
        }

        return merged.toString();
    }
}
