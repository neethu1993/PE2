/*Write a program, which reads number of students and n grades as input
 * (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.
 * Your program shall check for valid input. You should keep all the grades in an int[] and
 * use a method for each of the computations.
 *        Output:
 *        Enter the number of students: 4
 *        Enter the grade for student 1: 86
 *        Enter the grade for student 2: 65
 *        Enter the grade for student 3: 98
 *        Enter the grade for student 4: 77
 *        The average is 81.50
 *        The minimum is 65
 *        The maximum is 98
 */
package com.stackroute.pe2;

public class StudentAvgGrade {
    /*
    getting the minimium value
     */
    public int StudentMin(int num, int arr[]){
        int min = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        return min;

    }
    /*
    getting maximum value
     */
    public int StudentMax(int num, int arr[]){
        int max = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
    /*
    getting the average
     */
    public float StudentAvg(int num , int arr[]){
        int sum = 0;
        if(num != 0) {
            for (int i = 0; i < num; i++) {
                sum += arr[i];
            }
            return (sum / num);
        }
        else
            return -1;
    }
}
