/*
https://www.codewars.com/kata/jennys-secret-message
 */

package tasks.basic.program;

public class Greeter{

    public static String greet(String name) {


        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
