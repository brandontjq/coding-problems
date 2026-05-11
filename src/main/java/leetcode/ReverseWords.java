package leetcode;

public class ReverseWords {

    public String reverseWords(String s) {
        String result = "";
        String[] splitString = s.split(" ");
        for (int i = splitString.length - 1; i >= 0; i--) {
            if (splitString[i].equals("")) {
                continue;
            }
            if (i == splitString.length - 1) {
                result = splitString[i];
            } else {
                result = result + " " + splitString[i];
            }
        }
        return result;
    }

    public String reverseWordsStringBuilder(String s) {
        String[] words = s.trim().split("\\s+"); // handles "  hello   world  " → ["hello", "world"]
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}
