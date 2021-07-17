package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexPredefinedCharacterClasses {
    public static void main(String[] args) {
        Pattern.matches("\\d", "4"); //true
        Pattern.matches("\\d", "c"); //false
        Pattern.matches("\\D", "a"); //true
        Pattern.matches("\\W", "c"); //false
        /* In following two examples both are false because white-space is not an alphabet nor a digit*/
        Pattern.matches("\\w", " "); //false
        Pattern.matches("\\d", " "); //false
        Pattern.matches("\\s", " "); //true
        Pattern.matches("\\D", " "); //true
        Pattern.matches("\\W", " "); //true
        Pattern.matches("\\w", "cd"); //false
        /* Last one returns false because there has to be only one alphabet for one \\w */
        Pattern.compile("\\w")
                .matcher("cd")
                .find();//matches:  'c' at 0-1, 'd' at 1-2
        //'cd'

        Pattern.matches("\\w\\w", "cd"); //true
        Pattern.matches("[\\D]\\d", "b4"); //true
        Pattern.matches("[a-z]\\s[0-9]", "a 4"); //true
        Pattern.matches("\\D\\d\\w\\W", "w9s4"); //false
        Pattern.matches("\\w\\W", "_@"); //true
        Pattern.matches("\\W", "."); //true
        Pattern.matches("\\.", "."); //true
    }
}
