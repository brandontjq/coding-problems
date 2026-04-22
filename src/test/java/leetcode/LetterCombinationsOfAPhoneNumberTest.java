package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void test() {
        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations("23");
        System.out.println(result);
    }

}