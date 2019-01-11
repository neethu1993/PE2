/*Write a boolean method called isEven() in a class called EvenNumTest,
 which takes an int as input and returns true if the input is even.
 The signature of the method is as follows: public static boolean isEven(int number)
 */
package com.stackroute.pe2;

public class EvenNum {
    /*
   method to check for even number
   */
    public static boolean reverse(int num){
        //checking for even
        if(num % 2 == 0){
            return true;
        }
        else
            return false;
    }
}
