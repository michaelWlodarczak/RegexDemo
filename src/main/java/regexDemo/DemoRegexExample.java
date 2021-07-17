package magneticVariation.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegexExample {
    public static void main(String[] args) {
        String regex = "dupa";
        String input = "dupa jas, dupa zbita, dupa zimna, dupa wolowa" +
                "czarna dupa, fajna dupa";

        System.out.printf("using Pattern#matches: %s \n",
                Pattern.matches(regex, input));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String matchedValue = matcher.group();
            System.out.printf("Matched startIndex= %s, endIndex= %s, match: '%s'\n",
                    matcher.start(), matcher.end(), matchedValue);
        }

    }
}
