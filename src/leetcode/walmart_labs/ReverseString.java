package leetcode.walmart_labs;

public class ReverseString {

    public String reverseString(String s) {
        /*
        * https://leetcode.com/problems/reverse-string/*/
        StringBuilder string = new StringBuilder(s);
        return string.reverse().toString();
    }
}
