/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.others;

/**
 *
 * @author User
 */
public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        MoveZeros mz = new MoveZeros();
        for (int num : mz.moveZeroes(nums)) {
            System.out.println(num);
        }

    }

    public int[] moveZeroes(int[] nums) {
        int count = 0;
        int[] op = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                op[count] = nums[i];
                count++;
            }

        }
        nums = op;
        return nums;
    }
}
