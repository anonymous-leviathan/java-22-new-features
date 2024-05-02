package localdependent;

import java.text.ListFormat;
import java.util.List;
import java.util.Locale;

/**
 * The Main class is part of the local dependent package.
 * It contains a main method which demonstrates the use of the ListFormat class to format a list of names.
 */
public class Main {
    /**
     * The main method is the entry point of the program.
     * It creates a list of names and a ListFormat instance for the French locale, using the 'OR' type and 'FULL' style.
     * Then, it prints the formatted list of names to the console.
     *
     * @param args the command line arguments passed to the program
     */
    public static void main(String[] args) {
        // Define a list of names
        List<String> names = List.of("Alice", "Bob", "Charlie");

        /** Create a ListFormat instance for the French locale, using the 'OR' type and 'FULL' style
         ListFormat is a class in Java used to format a list of items in a way that is appropriate for a specific Locale.

         Locale.FRANCE is a constant provided by the Locale class that represents the French locale.

         ListFormat.Type.OR is an enum constant that tells the ListFormat instance to use the word "or"
         (or its equivalent in the specified locale) to separate the last two items in the list.

         ListFormat.Style.FULL is an enum constant that tells the ListFormat instance to use the full form for the
         list format. This typically includes spaces and punctuation as appropriate for the specified locale.

         The ListFormat instance is then stored in the formatter variable.
         */
        ListFormat formatter = ListFormat.getInstance(Locale.FRANCE, ListFormat.Type.OR, ListFormat.Style.FULL);

        // Print the formatted list of names to the console
        System.out.println(formatter.format(names));
    }
}