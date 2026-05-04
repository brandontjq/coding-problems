package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubdomainVisitCountTest {

    @Test
    void test() {
        SubdomainVisitCount test = new SubdomainVisitCount();
        String[] cpDomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        var result = test.subdomainVisits(cpDomains);
        System.out.println(result);
    }

    @Test
    void test2() {
        String s = "www.google.com";
        String[] s1 = s.split("\\.");
        System.out.println(s1);
    }
}