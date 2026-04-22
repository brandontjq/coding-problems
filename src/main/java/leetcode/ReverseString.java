package leetcode;

public class ReverseString {

    public String reverse(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >=0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();

    }

}
