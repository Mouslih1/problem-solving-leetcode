package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args)
    {
        String s = "((()))";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s)
    {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.isEmpty())
            {
                return false;
            }

            char x;
            switch (s.charAt(i))
            {

                case ')':
                    x = stack.pop();
                    if(x == '{' || x == '[')
                    {
                        return false;
                    }

                    break;

                case '}':
                    x = stack.pop();
                    if(x == '(' || x == '[')
                    {
                        return false;
                    }

                    break;
                case ']':
                    x = stack.pop();

                    if(x == '{' || x == '(')
                    {
                        return false;
                    }

                    break;
            }
        }

        return (stack.isEmpty());
    }
}
