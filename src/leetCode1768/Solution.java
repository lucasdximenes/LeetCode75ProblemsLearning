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
        int word1Pointer = 0;
        int word2Pointer = 0;
        StringBuilder mergedString = new StringBuilder();
        while (word1.length() != word1Pointer || word2.length() != word2Pointer) {
            if (word1Pointer != word1.length()) {
                mergedString.append(word1.charAt(word1Pointer));
                word1Pointer++;
            }
            if (word2Pointer != word2.length()) {
                mergedString.append(word2.charAt(word2Pointer));
                word2Pointer++;
            }
        }
        return mergedString.toString();
    }
}
