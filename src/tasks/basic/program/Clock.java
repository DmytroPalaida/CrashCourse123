/*
https://www.codewars.com/kata/beginner-series-number-2-clock/
 */

package tasks.basic.program;

public class Clock{
    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        return (h * 3600 + m * 60 + s) * 1000;
    }
}
