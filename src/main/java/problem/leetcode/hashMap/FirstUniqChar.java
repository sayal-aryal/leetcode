/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        FirstUniqChar fuc = new FirstUniqChar();
        System.out.println(fuc.firstUniqChar("aabb"));
    }

    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int returnvalue = 0;
        for (char c : s.toCharArray()) {
            if (map.get(c)==1) {
                return returnvalue;
            }
            returnvalue++;
        }
        return -1;

    }
}
