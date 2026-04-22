package leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0 ) return result;
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        backtrack(result, new StringBuilder(), map, digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, Map<String, String> map, String digits, int start) {

        if(sb.length() == digits.length() ) {
            result.add(sb.toString());
            return;
        }
        String digit = digits.charAt(start) + "";
        String alphabets = map.get(digit + "");
        for(int j = 0; j < alphabets.length(); j++) {
            sb.append(alphabets.charAt(j));
            backtrack(result, sb, map, digits, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
