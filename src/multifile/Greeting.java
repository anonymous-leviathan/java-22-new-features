package multifile;

/**
 * The Greeting class is part of the multifile package.
 * It contains a static method named great which generates a greeting message for a given name.
 */
public class Greeting {
    /**
     * The great method generates a greeting message for a given name.
     * It takes a string as an argument, which represents the name of the person to be greeted.
     * The method returns a string that is a greeting message for the given name.
     * @param name the name of the person to be greeted
     * @return a greeting message for the given name
     */
    public static String great(String name){
        // Generate a greeting message for the given name
        return "Hello " + name;
    }
}