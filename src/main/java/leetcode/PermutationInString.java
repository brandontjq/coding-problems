package leetcode;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - (s1.length()-1); i++) {
            String currSubstring = s2.substring(i, i + s1.length());
            int[] substringArr = new int[26];
            for (int j = 0; j < currSubstring.length(); j++) {
                substringArr[currSubstring.charAt(j) - 'a']++;
            }
            if (equals(s1Arr, substringArr)) {
                return true;
            }
        }
        return false;
    }

    private boolean equals(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
