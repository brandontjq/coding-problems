package datastructures.string;

import java.util.*;

public class CommonCharacters {
    public String[] commonCharacters(String[] strings) {
        // Write your code here.
        Map<Character, Integer> map = new HashMap<>();
        int lengthOfString = strings.length;

        for(int i = 0; i < lengthOfString; i++) {
            String currentString = strings[i];
            Set<Character> charSet = new HashSet<>();
            for (int j = 0; j < currentString.length(); j++) {
                char currentChar = currentString.charAt(j);
                boolean exist = charSet.add(currentChar);

                if (exist) {
                    map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
                }
            }
        }
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if (count == lengthOfString) {
                stringList.add(character+"");
            }
        }
        String[] result = new String[stringList.size()];
        stringList.toArray(result);
        return result;
    }
}
