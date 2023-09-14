/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k = 2;

//        int[] nums1 = {1,2,3};
//        int k = 3;
        SubArraySumEqualsK sasek = new SubArraySumEqualsK();
        System.out.println(sasek.subarraySum(nums1, k));

    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                continue;
            }
            int num = k - nums[i];
            if (map.containsValue(num)) {
                count++;
            }

        }
        return count;
    }
}
