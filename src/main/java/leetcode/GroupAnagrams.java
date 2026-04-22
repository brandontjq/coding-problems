package leetcode;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagramsGpt(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

//            for (char c : s.toCharArray()) {
//                count[c - 'a']++;
//            }

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, int[]> map = new HashMap<>();
        for(String s : strs) {
            int[] hash = new int[26];
            for(int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a']++;
            }
            map.put(s, hash);
        }

        List<List<String>> result = new ArrayList<>();
        List<String> strList = new ArrayList<>(Arrays.asList(strs));
        Set<String> set = new HashSet<>();
        for(int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            if(set.add(s)) {
                List<String> groupList = new ArrayList<>();
                groupList.add(s);

                for(int j = i + 1; j < strList.size(); j++) {
                    String secondString = strList.get(j);
                    if(Arrays.equals(map.get(s), map.get(secondString))) {
                        groupList.add(secondString);
                        //strList.remove(j);
                    }
                }

                result.add(groupList);
            }


        }
        return result;
    }
}
