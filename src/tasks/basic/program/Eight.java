/*
https://www.codewars.com/kata/age-range-compatibility-equation/
 */

package tasks.basic.program;

public class Eight{

        public static String datingRange(int age) {
            //return min-max
            int min, max;
            if (age <= 14) {
                min = (int) (age * 0.9);
                max = (int) (age * 1.1);
            } else {
                min = (int) (age / 2.0) + 7;
                max = (int) (age - 7) * 2;
            }
            return min + "-" + max;
        }
    }

