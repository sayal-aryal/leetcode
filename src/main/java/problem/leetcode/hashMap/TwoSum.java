/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class TwoSum {

    public static void main(String[] args) {

        for (int numb : twoSum(new int[]{2, 7, 11, 15}, 9)) {
            System.out.println(numb);
        }
        for (int numb : twoSum(new int[]{3, 2, 4}, 6)) {
            System.out.println(numb);
        }
        for (int numb : twoSum(new int[]{3, 3}, 6)) {
            System.out.println(numb);
        }
//        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        return new int[]{};
    }
}
