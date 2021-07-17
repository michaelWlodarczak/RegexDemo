package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexBoundaryMatching {
    public static void main(String[] args) {
        Pattern.matches("^The", "The line"); //false
        Pattern.compile("^The")
                .matcher("The line")
                .find();//matches:  'The' at 0-3
        //'The line'

        Pattern.compile("^The")
                .matcher("This is The line")
                .find();//no matches

        Pattern.compile("line$")
                .matcher("The line")
                .find();//matches:  'line' at 4-8
        //'The line'

        Pattern.compile("\\bline")
                .matcher("The line")
                .find();//matches:  'line' at 4-8
        //'The line'

        Pattern.compile("is")
                .matcher("This is island")
                .find();//matches:  'is' at 2-4, 'is' at 5-7, 'is' at 8-10
        //'This is island'

        Pattern.compile("\\bis")
                .matcher("This is island")
                .find();//matches:  'is' at 5-7, 'is' at 8-10
        //'This is island'

        Pattern.compile("\\bis\\b")
                .matcher("This is island")
                .find();//matches:  'is' at 5-7
        //'This is island'

        Pattern.compile("line")
                .matcher("The inclined line")
                .find();//matches:  'line' at 7-11, 'line' at 13-17
        //'The inclined line'

        Pattern.compile("\\bline")
                .matcher("The inclined line")
                .find();//matches:  'line' at 13-17
        //'The inclined line'

        Pattern.compile("line\\b")
                .matcher("The inclined line")
                .find();//matches:  'line' at 13-17
        //'The inclined line'

        Pattern.compile("lined\\b")
                .matcher("The inclined line")
                .find();//matches:  'lined' at 7-12
        //'The inclined line'

        Pattern.compile("\\bi")
                .matcher("water is inside inland")
                .find();//matches:  'i' at 6-7, 'i' at 9-10, 'i' at 16-17
        //'water is inside inland'

        Pattern.compile("\\bin")
                .matcher("water is inside inland")
                .find();//matches:  'in' at 9-11, 'in' at 16-18
        //'water is inside inland'

        /* Following example specifies Pattern.MULTILINE so that ^ and $ will be used to match at the start and end of each line (otherwise match will be at the start/end of the entire string).*/
        Pattern.compile("^T", Pattern.MULTILINE)
                .matcher("The First line\nThe SecondLine")
                .find();//matches:  'T' at 0-1, 'T' at 15-16
        //'The First line\nThe SecondLine'

        /* There can be \r or \r\n in the input string as line terminator*/
        Pattern.compile("^a\\w", Pattern.MULTILINE)
                .matcher("a an \r\napple")
                .find();//matches:  'ap' at 7-9
        //'a an \r\napple'

        Pattern.compile("\\Aa", Pattern.MULTILINE)
                .matcher("a \napple")
                .find();//matches:  'a' at 0-1
        //'a \napple'

        Pattern.compile("\\Ga")
                .matcher("aab 421aa")
                .find();//matches:  'a' at 0-1, 'a' at 1-2
        //'aab 421aa'
    }
}
