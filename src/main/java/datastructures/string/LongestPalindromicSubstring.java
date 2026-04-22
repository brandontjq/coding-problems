package datastructures.string;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        String result = "";
        int max = 0;
        for(int i = 0; i < str.length(); i++) {
            char first = str.charAt(i);
            for(int j = str.length() - 1; j > i; j--) {
                char second = str.charAt(j);
                if(first == second) {
                    if(isPalindrome(str.substring(i, j+1))) {
                        if(j - i + 1 > max) {
                            max = j - i + 1;
                            result = str.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < str.length() / 2) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
