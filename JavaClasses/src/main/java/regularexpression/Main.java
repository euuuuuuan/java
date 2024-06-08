package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        Pattern Class
//        - Defines a pattern (to be used in a search)
//
//        Matcher Class
//        - Used to search for the pattern
//
//        PatternSyntaxException Class
//        - Indicates syntax error
//        in a regular expression pattern

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        // the pattern is created using compile() method.
        // the first parameter indicates which pattern is being searched for
        // the second parameter has a flag to indicates that the search should be case-sensitive.
        // the second parameter is optional

        Matcher matcher = pattern.matcher("Visit W3Schools!");
        // matcher() is used to search for the pattern in a string.
        // it returns a Matcher object

        boolean matchFound = matcher.find();
        // find() method returns true if the pattern was found
        // and false if it was not found.

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        /*
        Pattern.CASE_INSENSITIVE
         - The case of letters will be ignored when performing a search.
        Pattern.LITERAL
         - Special characters in the pattern will
          not have any special meaning and will be treated as ordinary characters
          when performing a search.
        Pattern.UNICODE_CASE
         - Use it together with the CASE_INSENSITIVE flag
          to also ignore the case of letters outside of the English alphabet
*/

    }
}
// Outputs Match found
