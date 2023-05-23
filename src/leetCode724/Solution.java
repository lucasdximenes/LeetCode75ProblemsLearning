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
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int rightSum = totalSum;
        int pivot = -1;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                pivot = i;
                break;
            }

            leftSum += nums[i];
        }

        return pivot;
    }
}
