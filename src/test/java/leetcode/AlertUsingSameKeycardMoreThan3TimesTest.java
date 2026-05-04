package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlertUsingSameKeycardMoreThan3TimesTest {

    @Test
    void test() {
        AlertUsingSameKeycardMoreThan3Times test = new AlertUsingSameKeycardMoreThan3Times();
        String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = {"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};

        var result = test.alertNames(keyName, keyTime);
        System.out.println(result);
    }

    @Test
    void test2() {
        AlertUsingSameKeycardMoreThan3Times test = new AlertUsingSameKeycardMoreThan3Times();
        String[] keyName = {"alice","alice","alice","bob","bob","bob","bob"};
        String[] keyTime = {"12:01","12:00","13:00","21:00","21:20","21:30","23:00"};

        var result = test.alertNames(keyName, keyTime);
        System.out.println(result);
    }
}