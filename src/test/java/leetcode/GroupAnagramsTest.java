package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void test() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"", "", ""};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        System.out.println(result);
    }

    @Test
    void groupAnagramsGpt2() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams.groupAnagramsGpt(strs);
        System.out.println(result);
    }
}