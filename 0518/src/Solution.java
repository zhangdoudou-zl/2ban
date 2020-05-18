import sun.text.normalizer.UCharacter;

import java.util.Stack;

/**
 * @program: 0518
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-18 11:26
 **/
//括号匹配
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.add(ch);
            } else {
                //1.判断栈是否为空
                if (stack.empty()) {
                    System.out.println("右括号多");
                    return false;
                }
                //先拿到栈顶元素的括号
                char ch2 = stack.peek();
                if (ch2 == '('&&ch==')' || ch2 == '['&&ch==']' || ch2 == '{'&&ch=='}') {
                    stack.pop();
                } else {
                    System.out.println("左右括号不匹配");
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("左括号多");
            return false;
        }

          return true;
    }
}
