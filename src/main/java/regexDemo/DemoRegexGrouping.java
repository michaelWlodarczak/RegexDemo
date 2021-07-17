package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexGrouping {
    public static void main(String[] args) {
        Pattern.compile("This is (Lauretta Demaria|Jannette Ballard)")
                .matcher("This is Jannette Ballard")
                .find();//matches:  'This is Jannette Ballard' at 0-24
        //'This is Jannette Ballard'

        Pattern.compile("l(og|yr)ic")
                .matcher("logic lyric loyric")
                .find();//matches:  'logic' at 0-5, 'lyric' at 6-11
        //'logic lyric loyric'

        Pattern.compile("l(og|yr)ic")
                .matcher("logic lyric loric")
                .find();//matches:  'logic' at 0-5, 'lyric' at 6-11
        //'logic lyric loric'

        Pattern.matches("[a-z&&([n-q]|[u-x])]", "p"); //true
        Pattern.matches("[a-z&&([n-q]|[u-x])]", "t"); //false

        /* Following example shows the 12 hour time regex*/
        Pattern.matches("([1-9]|1[012]):[0-5][0-9]",
                "3:59"); //true
        Pattern.matches("([1-9]|1[012]):[0-5][0-9]",
                "3:70"); //false
    }
}
