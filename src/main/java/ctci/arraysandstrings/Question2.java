package ctci.arraysandstrings;

import java.util.Arrays;

public class Question2 {

    private String sort(String string) {
        char[] content = string.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


    //checking if the 2 sorted strings are the same, O(n log n)
    public boolean permutation (String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        return (sort(s1).equals(sort(s2)));
    }


    //check if the 2 strings have identical character counts, O(n)
    public boolean permutationEfficient(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] s1_array = s1.toCharArray();

        for(char c : s1_array) {
            System.out.println("c : " + c);
            letters[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int c = s2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
