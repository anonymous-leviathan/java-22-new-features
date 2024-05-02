package streamgatheresr;

import java.util.List;
import java.util.stream.Gatherers;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<String> list = List.of("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");

        List<List<String>> fixedWindows = list.stream().gather(Gatherers.windowFixed(2)).toList();

        System.out.println(fixedWindows);
        //[[the, quick], [brown, fox], [jumps, over], [the, lazy], [dog]]
    }
}
