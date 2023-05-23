package leetCode1480;

import java.util.Arrays;

public class Solution {
    // LeetCode 1480 - Running Sum of 1d Array

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4}; // Expected output: 1,3,6,10
        int[] input2 = {1, 1, 1, 1, 1}; // Expected output: 1,2,3,4,5
        int[] input3 = {3, 1, 2, 10, 1}; // Expected output: 3,4,6,16,17

        System.out.println(Arrays.toString(runningSum(input1)));
        System.out.println(Arrays.toString(runningSum(input2)));
        System.out.println(Arrays.toString(runningSum(input3)));
    }

    public static int[] runningSum(int[] nums) {
        int[] numsSum = new int[nums.length];
        numsSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            numsSum[i] = nums[i] + numsSum[i - 1];
        }
        return numsSum;
    }
}
