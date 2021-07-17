package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexTheDot {
    public static void main(String[] args) {
        Pattern.matches(".", "a"); //true
        System.out.println(Pattern.matches(".", "a"));
        Pattern.matches(".", " "); //true
        Pattern.matches(".z", "cz"); //true
        Pattern.matches(".z", "cb"); //false
        Pattern.matches(".z", "9z"); //true
        Pattern.matches("..e", "the"); //true
        Pattern.matches("t.e", "the"); //true
        Pattern.matches("...", "the"); //true
        Pattern.compile("i.u")
                .matcher("Linux")
                .replaceAll("yn");//result: 'Lynx'
    }
}
