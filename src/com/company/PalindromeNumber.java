package com.company;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String first = Integer.toString(x);
        String reversed = new StringBuilder(first).reverse().toString();

        if(first.equals(reversed))
            return true;
        else
            return false;

    }
}
