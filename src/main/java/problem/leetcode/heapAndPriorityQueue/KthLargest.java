/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.heapAndPriorityQueue;

import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class KthLargest {

    private final PriorityQueue<Integer> minHeap;

    private final int k;

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8,2,6};
        KthLargest kthLargest = new KthLargest(k, nums);

        System.out.println("Kth Largest Element:");
        System.out.println(kthLargest.add(3)); // 4
        System.out.println(kthLargest.add(5)); // 5
        System.out.println(kthLargest.add(10)); // 5
        System.out.println(kthLargest.add(9)); // 8
        System.out.println(kthLargest.add(4)); // 8
    }

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>(k);
        this.k = k;

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size()>k){
        minHeap.poll();
        }
        return minHeap.peek();
    }
}
