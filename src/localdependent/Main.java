package localdependent;

import java.text.ListFormat;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        ListFormat formatter = ListFormat.getInstance(
                Locale.FRANCE,ListFormat.Type.OR,ListFormat.Style.FULL);
        System.out.println(formatter.format(names));
    }
}
