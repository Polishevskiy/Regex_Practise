package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "ABCOPAB7OP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("6abch$");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");
//        System.out.println("abcd   \\   efg");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w");  // [A-Za-z0-9_]
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");
//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");
//        String s1 = "poka abc Zaur dom kino abstrakcionizm";
//        Pattern pattern1 = Pattern.compile("\\w{4}");
//        String s1 = "poka    abc         Zaur   dom   kino abstrakcionizm";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");       // [\t\n\r\f]
//        String s1 = "abcd abce3 abcfa78abcg6a!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");
//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");
//        String s1 = "DABCDABABDABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");        //DABABAABABABAB
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*");
//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("\\Aa");
//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("bch\\Z");
        String s1 = "abcd abcd4 afc4ced7";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");


        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }
}
