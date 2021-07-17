package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class RegexDemoCharacterClasses {
    public static void main(String[] args) {
        Pattern.matches("[0-9]", "9"); //true
        Pattern.matches("[[0-9][a-z]]", "t"); //true
        Pattern.matches("[[0-9][^e-z]]", "s"); //false
        Pattern.matches("[a-z][0-9]", "t5"); //true
        Pattern.matches("[a-z&&[n-q]]", "s"); //false
        Pattern.matches("[a-z&&[n-q]]", "o"); //true
        Pattern.matches("[jJ][aA][vV][aA]", "jAva"); //true
        Pattern.matches(".[aA][vV][aA]", "mAva"); //true
        Pattern.matches("[jJ][aA].[aA]", "lAva"); //false
        Pattern.matches("[A-Z][a-z].java", "My.java"); //true
        Pattern.matches("[A-Z][a-z].java", "My8java"); //true
        /* We have to escape '.' for it to behave as normal character and not as the metacharacter. For escaping we have to use double backslash.*/
        Pattern.matches("[A-Z][a-z]\\.java", "My8java"); //false
        Pattern.matches("[A-Z][a-z]\\.java", "My.java"); //true
        /* We can instead put '.' inside squared brackets. In that case we don't have to escape it.*/
        Pattern.matches("[A-Z][a-z][.]java", "My8java"); //false
        Pattern.matches("[A-Z]", "USA"); //false
        /* In next example, if called three times find() will match all three characters.*/
        Pattern.compile("[A-Z]")
                .matcher("USA")
                .find();//matches:  'U' at 0-1, 'S' at 1-2, 'A' at 2-3
        //'USA'

        Pattern.matches("[1-9][1-9]-[1-9][1-9]",
                "38-99"); //true
    }
}
