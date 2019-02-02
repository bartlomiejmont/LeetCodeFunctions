package com.company;

public class ReverseInteger {

    public int reverse(int x) {
        String number = Integer.toString(x);
        String numberReversed;
        if(number.contains("-")){
            numberReversed = new StringBuilder(number).reverse().insert(0,"-").substring(0,number.length()).toString();
        }
        else {
            numberReversed = new StringBuilder(number).reverse().toString();
        }
        try {
            return Integer.parseInt(numberReversed);
        }       catch (NumberFormatException e) {
            return 0;
        }

    }
}
