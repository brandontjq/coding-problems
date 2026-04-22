package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchSuggestionSystemTest {

    @Test
    void test() {
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        SearchSuggestionSystem uut = new SearchSuggestionSystem();
        List<List<String>> result = uut.suggestedProducts2(products, searchWord);
        System.out.println(result);
    }

}