package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args)
    {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s)
    {
        Map<Character, Integer> romanToInteger = new HashMap<>();

        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int result = 0;
        int length = s.length();

        for (int i = 0; i < length; i++)
        {
            int currentValue = romanToInteger.get(s.charAt(i));

            if (i + 1 < length)
            {
                int nextValue = romanToInteger.get(s.charAt(i + 1));

                if (currentValue < nextValue)
                {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }
}
