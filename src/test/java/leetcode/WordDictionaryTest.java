package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    @Test
    void test() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("a");
        boolean searchA = wordDictionary.search("a");
        boolean searchADot = wordDictionary.search("a.");
        boolean searchDotA = wordDictionary.search(".a");
        assertTrue(searchA);
        assertFalse(searchADot);
        assertFalse(searchDotA);
    }

    @Test
    void test2() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        boolean searchWithDotDot = wordDictionary.search("b..");
        boolean searchWithBDot = wordDictionary.search("b.");
        boolean searchPad = wordDictionary.search("pad");
        boolean searchBad = wordDictionary.search("bad");
        boolean searchWithDot = wordDictionary.search(".ad");

        assertFalse(searchPad);
        assertFalse(searchWithBDot);
        assertTrue(searchBad);
        assertTrue(searchWithDot);
        assertTrue(searchWithDotDot);
    }
}