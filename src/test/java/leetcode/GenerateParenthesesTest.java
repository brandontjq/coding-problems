package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    
    @Test
    void test() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(2);
        System.out.println(result);
    }

}