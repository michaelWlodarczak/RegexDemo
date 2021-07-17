package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexTheLogicalOperatorOR {
    public static void main(String[] args) {
        Pattern.matches("a|b", "a"); //true
        Pattern.compile("a|b")
                .matcher("alphabet")
                .replaceAll("X");//result: 'XlphXXet'

        Pattern.matches("[a-d]|[x-z]", "x"); //true
        Pattern.matches("[a-d][x-z]|[^*&%]", "cy%"); //false

        /* This will still match. Engine will match either everything to the left or to the right of the pipe*/
        Pattern.compile("Gravity|levity")
                .matcher("levity Gravity Gravitlevity")
                .find();//matches:  'levity' at 0-6, 'Gravity' at 7-14, 'levity' at 21-27
        //'levity Gravity Gravitlevity'

        Pattern.compile("Lauretta Demaria|Jannette Ballard")
                .matcher("Jannette Ballard")
                .find();//matches:  'Jannette Ballard' at 0-16
        //'Jannette Ballard'

        Pattern.compile("This is Lauretta Demaria|Jannette Ballard")
                .matcher("This is Lauretta Demaria")
                .find();//matches:  'This is Lauretta Demaria' at 0-24
        //'This is Lauretta Demaria'

        /* The complete sentence doesn't match because of the same reason mentioned above. We have to use groups (next section) for this kind of situations.*/
        Pattern.compile("This is Lauretta Demaria|Jannette Ballard")
                .matcher("This is Jannette Ballard")
                .find();//matches:  'Jannette Ballard' at 8-24
        //'This is Jannette Ballard'
    }
}
