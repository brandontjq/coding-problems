package others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadgeAccessTest {

    @Test
    void test() {
        String[][] records = {
            {"Paul", "enter"},
            {"Mary", "enter"},
            {"Paul", "exit"},
            {"Mary", "exit"},
            {"John", "exit"},
            {"Paul", "enter"}
        };
        BadgeAccess test = new BadgeAccess();
        test.solve(records);
    }
}