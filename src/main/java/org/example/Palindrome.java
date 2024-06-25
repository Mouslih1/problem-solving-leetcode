package org.example;

public class Palindrome {

    public static void main(String[] args)
    {
        int x = 121;
        System.out.println(Palindrome.isPalindrome(x));
    }

    public static boolean isPalindrome(int x)
    {
        if(x < 0)
        {
            return false;
        }

        String xInString = Integer.toString(x);

        for(int i = 0; i < xInString.length() ; i++)
        {
            if(xInString.charAt(i) != xInString.charAt(xInString.length() - 1 - i))
            {
                return false;
            }
        }

        return true;
    }
}
