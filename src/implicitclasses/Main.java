public static void main() {
//      java.lang.StringTemplate#STR is a preview API and may be removed in a future release
    System.out.println(STR."\{greeting()}I'm running with implicit main class!");
}

static String greeting() {
    return "Hello, World!";
}
