package com.stackroute.pe2;

public class PowerOfFour {
    /*
  method to check for a number to be power of 4
   */
    String reverse(int num){
        if(num == 0)
            return "0";
        while(num != 1)
        {
            if(num % 4 != 0)
                return "Not a Power of 4";
            num = num / 4;
        }
        return "Power of 4";

    }
}
