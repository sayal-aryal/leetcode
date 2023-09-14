/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.hashMap;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        IntersectionOfTwoArray iota = new IntersectionOfTwoArray();
       for(int a: iota.intersection(nums1, nums2)) {
           System.out.println(a);
       }
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] op = new int[set2.size()];

        int count = 0;
        for (int num : set2) {
            op[count++] = num;
        }

        return op;
    }
}
