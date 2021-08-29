/*
https://www.codewars.com/kata/century-from-year
 */

package tasks.basic.program;

public class Solution{
    public static int century(int number) {
        // your code goes here
        return (int) (Math.ceil(number * 0.01));
    }
}
