package multifile;

/**
 * The Hello class is part of the multifile package.
 * It contains a main method which is the entry point of the program.
 * The main method prints a greeting message for the first argument passed to the program.
 */
public class Hello {
    /**
     * The main method is the entry point of the program.
     * It takes an array of strings as an argument, which represent the command line arguments passed to the program.
     * The method prints a greeting message for the first argument by calling the great method from the Greeting class.
     * @param args the command line arguments passed to the program
     */
    public static void main(String[] args) {
        // Print a greeting message for the first argument
        System.out.println(Greeting.great(args[0]));
    }
}