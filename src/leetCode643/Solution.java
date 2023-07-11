package leetCode643;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        // expected output = 12.75000
        System.out.println(findMaxAverage(nums1, k1));

        int[] nums2 = {5};
        int k2 = 1;
        // expected output = 5.00000
        System.out.println(findMaxAverage(nums2, k2));

        int[] nums3 = {-1};
        int k3 = 1;
        // expected output = -1.00000
        System.out.println(findMaxAverage(nums3, k3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
