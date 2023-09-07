/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.heapAndPriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class TopKFrequent {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        for (int a : topKFrequent(nums, k)) {
            System.out.println(a);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((entry1, entry2) -> entry1.getValue() - entry2.getValue());

        for (Map.Entry entry : freqMap.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] freqNumber = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            freqNumber[i] = pq.poll().getKey();
        }

        return freqNumber;

    }
}
