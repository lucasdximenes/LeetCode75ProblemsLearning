package leetCode1679;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // input 1:
        int[] nums1 = {1,2,3,4};
        int k1 = 5;
        // expected output = 2
        System.out.println(maxOperations(nums1, k1));
        // ------------------------------------------

        // input 2:
        int[] nums2 = {3,1,3,4,3};
        int k2 = 6;
        // expected output = 2
        System.out.println(maxOperations(nums2, k2));
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (countMap.containsKey(complement) && countMap.get(complement) > 0) {
                count++;
                countMap.put(complement, countMap.get(complement) - 1);
            } else {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
