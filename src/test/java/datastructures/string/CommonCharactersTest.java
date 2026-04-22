package datastructures.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonCharactersTest {

    @Test
    void test() {
        CommonCharacters commonCharacters = new CommonCharacters();
        String[] strings = new String[]{"abc", "bcd", "cbaccd"};
        var result = commonCharacters.commonCharacters(strings);
        System.out.println(result);
    }
}