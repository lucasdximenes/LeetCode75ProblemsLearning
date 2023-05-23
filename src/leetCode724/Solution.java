package leetCode724;

public class Solution {
    // LeetCode 724 Find Pivot Index
    public static void main(String[] args) {
        int[] input1 = {1, 7, 3, 6, 5, 6}; // Expected output: 3
        int[] input2 = {1, 2, 3}; // Expected output: -1
        int[] input3 = {2, 1, -1}; // Expected output: 0

        System.out.println(pivotIndex(input1));
        System.out.println(pivotIndex(input2));
        System.out.println(pivotIndex(input3));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            // leftSum
            for (int j = i - 1; j >= 0; j--) {
                leftSum += nums[j];
            }
            // rightSum
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                pivot = i;
                break;
            } else {
                leftSum = 0;
                rightSum = 0;
            }
        }
        return pivot;
    }
}
