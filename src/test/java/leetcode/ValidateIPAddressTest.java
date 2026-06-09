package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIPAddressTest {

    @Test
    void test() {
        ValidateIPAddress test = new ValidateIPAddress();
        //String queryIP = "172.16.254.1";
        //String queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String queryIP = "1.1.1.1111111111111111111111111111111111111111111111111111";
        var result = test.validIPAddress(queryIP);
        System.out.println(result);
    }
}