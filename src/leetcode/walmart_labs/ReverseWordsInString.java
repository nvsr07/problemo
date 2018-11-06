package leetcode.walmart_labs;

public class ReverseWordsInString {
    /**
     * https://leetcode.com/problems/reverse-words-in-a-string/*/

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder partial = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(isValidCharacter(s.charAt(i))){
                partial.append(s.charAt(i));
            }else{
                if(partial.length() > 0){
                    result.append(partial.reverse());
                    result.append(" ");
                }
                partial = new StringBuilder();
            }
        }
        if(partial.length() > 0){
            result.append(partial.reverse());
        }
        return result.reverse().toString().trim();

    }
    private boolean isValidCharacter(char elem){
        return elem !=' ';
    }
}
