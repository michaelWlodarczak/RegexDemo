package magneticVariation.regexDemo;

import java.util.regex.Pattern;

public class DemoRegexLiteralsInRegex {
    public static void main(String[] args) {
        String regex = "er";
        String input = "Eversand";

        Pattern.matches(regex, input); //false
        //System.out.println(Pattern.matches(regex,input));
        /* matches() tries to match the expression against the entire string. Whereas, find() can match in a substring*/
        Pattern.compile(regex).matcher(input).find(); //true
        //System.out.println(Pattern.compile(regex).matcher(input).find());


        Pattern.compile("er").matcher("Eversand").replaceAll("SEA");//result: 'EvSEAsand'
        System.out.println(Pattern.compile("er").matcher("Eversand").replaceAll("SEA"));
    }
}
