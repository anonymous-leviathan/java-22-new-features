package unnamed_variables;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * This method demonstrates the use of unnamed variables in Java.
     * It first prints a string "Example of unnamed variables" to the console.
     * Then, it tries to parse a string "hello" into an integer.
     * Since "hello" is not a number, a NumberFormatException is thrown.
     * The catch block catches the exception and assigns it to an unnamed variable (_).
     * This is useful when you want to catch an exception but don't need to use the exception object itself.
     * Finally, an error message "Number Format Exception" is printed to the console.
     */
    public static void showExample() {
        // Print a string to the console
        System.out.println("Example of unnamed variables");

        try {
            // Try to parse a string into an integer
            int num = Integer.parseInt("hello");
        } catch (NumberFormatException _) {
            // Catch the NumberFormatException and assign it to an unnamed variable
            // Print an error message to the console
            System.err.println("Number Format Exception");
        }
    }

    /**
     * This method demonstrates an example of using unnamed variables in Java.
     * It first prints a string "Example of 2" to the console.
     * Then, it creates a list of integers from 1 to 5.
     * Finally, it uses a forEach loop to print the string "Hello" for each element in the list.
     * Note that the lambda expression in the forEach loop uses an unnamed variable (_).
     */
    public static void showExample2() {
        // Print a string to the console
        System.out.println("Example of 2");

        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Use a forEach loop to print "Hello" for each element in the list
        list.forEach(_ -> System.out.println("Hello"));
    }


    public static void main(String[] args) {
        showExample();
        showExample2();
    }
}
