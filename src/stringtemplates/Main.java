package stringtemplates;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//      java.lang.StringTemplate#STR is a preview API and may be removed in a future release
        String interpolated = STR."\{a} times \{b} = \{Math.multiplyExact(a, b)}";
        System.out.println(interpolated);
    }
}
