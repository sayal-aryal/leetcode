/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.stack;

import java.util.Stack;

/**
 *
 * @author User
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()"));
        System.out.println(vp.isValid("()[]{}"));
        System.out.println(vp.isValid("(]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();

                if (top == '(' && c == ')' || top == '{' && c == '}' || top == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
